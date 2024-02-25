package com.banksimplifiedbackend.repositories;

import com.banksimplifiedbackend.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
