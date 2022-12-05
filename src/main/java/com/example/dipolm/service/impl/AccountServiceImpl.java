package com.example.dipolm.service.impl;

import com.example.dipolm.model.entity.Account;
import com.example.dipolm.model.repository.AccountRepository;
import com.example.dipolm.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;

    @Override
    public List<Account> getAccounts() {
        return repository.findAll();
    }




}