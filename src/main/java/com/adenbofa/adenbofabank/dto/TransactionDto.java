package com.adenbofa.adenbofabank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDto {
    private String transactionId;
    private String transactionType;
    private BigDecimal amount;
    private String accountNumber;
    private String status;
}
