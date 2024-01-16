package com.example.tmbank.presentation.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import lombok.AllArgsConstructor;
import com.example.tmbank.common.CommonTools;
import com.example.tmbank.dtos.bankaccount.AddBankAccountRequest;
import com.example.tmbank.dtos.bankaccount.AddBankAccountResponse;
import com.example.tmbank.dtos.bankaccount.BankAccountDto;
import com.example.tmbank.dtos.customer.*;
import com.example.tmbank.dtos.transaction.AddWirerTransferRequest;
import com.example.tmbank.dtos.transaction.AddWirerTransferResponse;
import com.example.tmbank.dtos.transaction.GetTransactionListRequest;
import com.example.tmbank.dtos.transaction.TransactionDto;
import com.example.tmbank.service.IBankAccountService;
import com.example.tmbank.service.ICustomerService;
import com.example.tmbank.service.ITransactionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "BankWS")
@SOAPBinding
@AllArgsConstructor
public class BankSoapController {

    private final IBankAccountService bankAccountService;
    private final ICustomerService customerService;
    private ITransactionService transactionService;
    private CommonTools commonTools;

    @WebMethod

    /**
     *
     @WebResult was user in order to replace return balise
     by Customer balise in SOAP Response.
     */
    @WebResult(name = "Customer")
    public List<CustomerDto> customers() {
        return customerService.getAllCustomers();
    }


    @WebMethod
    /**
     * @WebResult was user in order to replace return balise
     * by Customer balise in SOAP Response.
     */
    @WebResult(name = "Customer")
    public CustomerDto customerByIdentity(@WebParam(name = "identity") String identity) {
        return customerService.getCustomByIdentity(identity);
    }

    @WebMethod
    /**
     * @WebResult was user in order to replace return balise
     * by Customer balise in SOAP Response.
     */
    @WebResult(name = "Customer")
    public AddCustomerResponse createCustomer(@WebParam(name = "Customer") AddCustomerRequest dto) {
        return customerService.createCustomer(dto);
    }

    /**
     * @WebResult was user in order to replace return balise
     * by BankAccount balise in SOAP Response.
     */
    @WebResult(name = "BankAccount")
    @WebMethod
    public List<BankAccountDto> bankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @WebMethod
    /**
     * @WebResult was user in order to replace return balise
     * by BankAccount balise in SOAP Response.
     */
    @WebResult(name = "BankAccount")
    public BankAccountDto bankAccountByRib(@WebParam(name = "rib") String rib) {
        return bankAccountService.getBankAccountByRib(rib);
    }


    /**
     * @WebResult was user in order to replace return balise
     * by BankAccount balise in SOAP Response.
     */
    @WebResult(name = "BankAccount")
    @WebMethod
    public AddBankAccountResponse createBankAccount(@WebParam(name = "bankAccountRequest") AddBankAccountRequest dto) {
        return bankAccountService.saveBankAccount(dto);
    }

    /**
     * @WebResult was user in order to replace return balise
     * by Transaction balise in SOAP Response.
     */
    @WebResult(name = "Transaction")
    @WebMethod
    public AddWirerTransferResponse createWirerTransfer(@WebParam(name = "wirerTransferRequest") AddWirerTransferRequest dto) {
        return transactionService.wiredTransfer(dto);
    }

    /**
     * @WebResult was user in order to replace return balise
     * by Transaction balise in SOAP Response.
     */
    @WebResult(name = "Transaction")
    @WebMethod
    public List<TransactionDto> getTransactions(@WebParam(name = "dto") GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }

    @WebResult(name = "Customer")
    @WebMethod
    public UpdateCustomerResponse changeCustomer(@WebParam(name = "identityRef") String identityRef, @WebParam(name = "dto") UpdateCustomerRequest dto) {
        return customerService.updateCustomer(identityRef, dto);
    }

    @WebMethod
    public String deleteCustomer(@WebParam(name = "identityRef") String identityRef) {
        return customerService.deleteCustomerByIdentityRef(identityRef);
    }
}