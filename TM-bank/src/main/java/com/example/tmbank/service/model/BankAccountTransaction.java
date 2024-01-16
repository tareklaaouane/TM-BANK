package com.example.tmbank.service.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.tmbank.enums.TransactionType;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BankAccountTransaction {
    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private Double amount;
    @ManyToOne
    private BankAccount bankAccount;

    @ManyToOne
    private User user;
}
