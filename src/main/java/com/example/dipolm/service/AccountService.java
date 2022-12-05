package com.example.dipolm.service;

import com.example.dipolm.model.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    List<Account>getAccounts();

}
