package com.example.dipolm.comtroller;

import com.example.dipolm.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
@Autowired
    private UserServiceImpl userService;

    @GetMapping("/admin")
    public String userList(Model model) {
        model.addAttribute("allUser", userService.allUser());
        return "admin";
    }

    @PostMapping("/admin")
    public String deleteUser(@RequestParam(required = true, defaultValue = "") Integer id,
                             @RequestParam(required = true, defaultValue = "") String action, Model model) {
        if ( action.equals("delete") ) {
            userService.deleteUser(id);
        }
        return "redirect:/admin";
    }
    @GetMapping("/admin/gt/{id}")
    public String gtUser(@Param("id")Integer id, Model model){
        model.addAttribute("allUser", userService.usergtList(id));
        return "admin";
    }
}

