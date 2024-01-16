package com.example.tmbank.service;

import com.example.tmbank.dtos.transaction.AddWirerTransferRequest;
import com.example.tmbank.dtos.transaction.AddWirerTransferResponse;
import com.example.tmbank.dtos.transaction.GetTransactionListRequest;
import com.example.tmbank.dtos.transaction.TransactionDto;

import java.util.List;

public interface ITransactionService {
    AddWirerTransferResponse wiredTransfer(AddWirerTransferRequest dto);

    List<TransactionDto> getTransactions(GetTransactionListRequest dto);
}
