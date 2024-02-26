package com.banksimplifiedbackend.services;

import com.banksimplifiedbackend.domain.user.User;
import com.banksimplifiedbackend.domain.user.UserType;
import com.banksimplifiedbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void  validationTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Merchant type user is not authorized to carry out transactions");
        }

        if (sender.getBalance().compareTo(amount) <= 0) {
            throw new Exception("Insufficient funds");
        }
    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found"));
    }

    public void saveUser(User user) {
        this.repository.save(user);
    }
}
