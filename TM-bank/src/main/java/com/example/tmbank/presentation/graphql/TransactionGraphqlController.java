package com.example.tmbank.presentation.graphql;

import lombok.AllArgsConstructor;
import com.example.tmbank.common.CommonTools;
import com.example.tmbank.dtos.transaction.AddWirerTransferRequest;
import com.example.tmbank.dtos.transaction.AddWirerTransferResponse;
import com.example.tmbank.dtos.transaction.GetTransactionListRequest;
import com.example.tmbank.dtos.transaction.TransactionDto;
import com.example.tmbank.service.ITransactionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor

public class TransactionGraphqlController {

    private ITransactionService transactionService;
    private CommonTools commonTools;

    @MutationMapping
    public AddWirerTransferResponse addWirerTransfer(@Argument("dto") AddWirerTransferRequest dto) {
        return transactionService.wiredTransfer(dto);
    }

    @QueryMapping
    public List<TransactionDto> getTransactions(@Argument GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }
}