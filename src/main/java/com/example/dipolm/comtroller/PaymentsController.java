package com.example.dipolm.comtroller;

import com.example.dipolm.model.dto.AccountDto;
import com.example.dipolm.model.dto.CreditCartDto;
import com.example.dipolm.model.entity.CreditCard;
import com.example.dipolm.service.AccountService;
import com.example.dipolm.service.CreditCardService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PaymentsController {
    private AccountService service;
    private CreditCardService cardService;

    @GetMapping(value = "/payments")
    public String payments(Model model) {
        model.addAttribute(" ", " ");
        return "payments";
    }
    @GetMapping(value = "/refill")
    public String refill(Model model){
        model.addAttribute(" ", " ");
        return "refill";
    }
    @PostMapping(value = "/refill")
    public String addSum(@RequestParam Integer number, @RequestParam Integer sum, @RequestParam Integer pin, Model model){



        return "accounts";
    }


    @GetMapping(value = "/transfer")
    public String transfer(Model model){
        model.addAttribute(" ", " ");
        return "transfer";

    }


    @GetMapping(value = "/removing")
    public String removing(Model model){
        model.addAttribute(" ", " ");
        return "removing";
    }
}
