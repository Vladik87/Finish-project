package com.example.dipolm.service;

import com.example.dipolm.model.entity.CreditCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CreditCardService {

    List<CreditCard>getCreditCards();
}
