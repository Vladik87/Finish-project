package com.example.dipolm.comtroller;

import com.example.dipolm.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CreditCardsController {
    private final CreditCardService service;

    @GetMapping(value = "/creditcards")
    public String getCreditCards(Model model){
       var cards = service.getCreditCards();
        model.addAttribute("cards", cards);
        return "creditcards";
    }

}
