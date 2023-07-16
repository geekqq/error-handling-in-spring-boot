package com.javatechie.validationdemo.service;

import com.javatechie.validationdemo.dto.UserRequest;
import com.javatechie.validationdemo.exception.UserNotFoundException;
import com.javatechie.validationdemo.model.User;
import com.javatechie.validationdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(
                0,
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationality()
        );
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException("User with id " + id + " is not found");
        }
    }
}
