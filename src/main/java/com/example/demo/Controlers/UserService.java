package com.example.demo.Controlers;

import com.example.demo.users.MyUser;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public List<MyUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(MyUser user) {
        if (userRepository.findMyUserByEmail(user.getEmail()).isPresent()) {
            userRepository.save(user);
        }
    }
}
