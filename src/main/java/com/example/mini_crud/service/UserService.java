package com.example.mini_crud.service;

import com.example.mini_crud.modal.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();
    private Long counter = 1L;

    public List<User> getAllUsers() {
        return  users;
    }

    public User creatUser(User user) {
        user.setId(counter++);
        users.add(user);
        return  user;
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
