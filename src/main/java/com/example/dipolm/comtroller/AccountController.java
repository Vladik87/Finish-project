package com.example.dipolm.comtroller;

import com.example.dipolm.model.repository.AccountRepository;
import com.example.dipolm.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AccountController {
private final AccountService service;

@GetMapping("/accounts")
    public String getAccounts(Model model){
  var accounts =service.getAccounts();
  model.addAttribute("accounts", accounts);
  return"accounts";
}

}
