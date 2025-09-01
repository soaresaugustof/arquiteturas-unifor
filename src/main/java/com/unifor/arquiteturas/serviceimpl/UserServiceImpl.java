package com.unifor.arquiteturas.serviceimpl;

import com.unifor.arquiteturas.model.User;
import com.unifor.arquiteturas.repository.UserRepository;
import com.unifor.arquiteturas.service.UserInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserInterface {
    private UserRepository repository;
    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = repository.findById(id);
        return user.orElse(null);
    }
}
