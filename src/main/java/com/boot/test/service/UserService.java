package com.boot.test.service;

import com.boot.test.entities.User;
import com.boot.test.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public Iterable<User> getAll() {
        return repository.findAll();
    }

    public Optional<User> getById(Integer id) {
        return repository.findById(id);
    }
    public long count() {
        return repository.count();
    }
}
