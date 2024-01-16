package com.example.tmbank.service.model;

import com.example.tmbank.dtos.bankaccount.AddBankAccountRequest;
import com.example.tmbank.dtos.bankaccount.AddBankAccountResponse;
import com.example.tmbank.dtos.bankaccount.BankAccountDto;

import java.util.List;

public interface IBankAccountService {
    AddBankAccountResponse saveBankAccount(AddBankAccountRequest dto);

    List<BankAccountDto> getAllBankAccounts();

    BankAccountDto getBankAccountByRib(String rib);
}