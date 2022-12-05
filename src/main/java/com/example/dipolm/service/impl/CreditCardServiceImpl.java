package com.example.dipolm.service.impl;

import com.example.dipolm.model.entity.CreditCard;
import com.example.dipolm.model.repository.CreditCardRepository;
import com.example.dipolm.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {
    private final CreditCardRepository repository;
    @Override
    public List<CreditCard> getCreditCards() {
        return repository.findAll();
    }

}
