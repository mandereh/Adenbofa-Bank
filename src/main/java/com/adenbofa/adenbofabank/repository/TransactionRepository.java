package com.adenbofa.adenbofabank.repository;

import com.adenbofa.adenbofabank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
