package com.banksimplifiedbackend.controllers;

import com.banksimplifiedbackend.domain.transaction.Transaction;
import com.banksimplifiedbackend.dtos.TransactionDTO;
import com.banksimplifiedbackend.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO body) throws Exception {
        Transaction transaction = this.transactionService.createTransaction(body);
        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }
}
