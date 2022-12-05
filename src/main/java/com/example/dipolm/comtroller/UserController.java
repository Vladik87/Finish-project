package com.example.dipolm.comtroller;

import com.example.dipolm.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {
    @GetMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("  ", " ");
        return "index";
    }

    @GetMapping(value = "/login")
    public String enter(Model model) {
        model.addAttribute("  ", " ");
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, @RequestParam String password, Model model) {
        var userDto = new UserDto();
        userDto.setName(name);
        userDto.setPassword(password);
        if (userDto.getName().equals(name)&&userDto.getPassword().equals(password)) {
            return "user";
        }

        return "user";

    }

    @PostMapping(value = "/user")
    public String user(@RequestParam String name, @RequestParam String password, Model model) {
        if ( name == "vlad" && password == "qwerty1" ) {
            return "user";
        }
        return "user";
    }

}
