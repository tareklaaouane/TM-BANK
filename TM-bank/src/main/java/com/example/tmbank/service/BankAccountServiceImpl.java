package com.example.tmbank.service;


import lombok.AllArgsConstructor;
import com.example.tmbank.dao.BankAccountRepository;
import com.example.tmbank.dao.CustomerRepository;
import com.example.tmbank.dtos.bankaccount.AddBankAccountRequest;
import com.example.tmbank.dtos.bankaccount.AddBankAccountResponse;
import com.example.tmbank.dtos.bankaccount.BankAccountDto;
import com.example.tmbank.enums.AccountStatus;
import com.example.tmbank.service.exception.BusinessException;
import com.example.tmbank.service.model.BankAccount;
import com.example.tmbank.service.model.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class BankAccountServiceImpl implements IBankAccountService {
    private final BankAccountRepository bankAccountRepository;
    private final CustomerRepository customerRepository;
    private ModelMapper modelMapper;


    @Override
    public AddBankAccountResponse saveBankAccount(AddBankAccountRequest dto) {
        // BankAccount bankAccount = modelMapper.map(dto, BankAccount.class);
        BankAccount bankAccount = convertDto(dto);
        Customer customerP = customerRepository.findByIdentityRef(bankAccount.getCustomer().getIdentityRef()).orElseThrow(
                () -> new BusinessException(String.format("No customer with the identity: %s exist", dto.getCustomerIdentityRef())));
        bankAccount.setAccountStatus(AccountStatus.OPENED);
        bankAccount.setCustomer(customerP);
        bankAccount.setCreatedAt(new Date());
        AddBankAccountResponse response = modelMapper.map(bankAccountRepository.save(bankAccount), AddBankAccountResponse.class);
        response.setMessage(String.format("RIB number [%s] for the customer [%s] has been successfully created", dto.getRib(), dto.getCustomerIdentityRef()));
        return response;
    }

    private BankAccount convertDto(AddBankAccountRequest dto) {
        return BankAccount.builder().
                rib(dto.getRib()).amount(dto.getAmount()).customer(Customer.builder().identityRef(dto.getCustomerIdentityRef()).build()).
                build();
    }

    @Override
    public List<BankAccountDto> getAllBankAccounts() {
        return bankAccountRepository.findAll().stream().
                map(bankAccount -> modelMapper.map(bankAccount, BankAccountDto.class)).
                collect(Collectors.toList());
    }

    @Override
    public BankAccountDto getBankAccountByRib(String rib) {
        return modelMapper.map(bankAccountRepository.findByRib(rib).orElseThrow(
                () -> new BusinessException(String.format("No Bank Account with rib [%s] exist", rib))), BankAccountDto.class);
    }
}