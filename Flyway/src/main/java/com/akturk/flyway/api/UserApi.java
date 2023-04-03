package com.akturk.flyway.api;

import com.akturk.flyway.entity.User;
import com.akturk.flyway.repo.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/users")
@RequiredArgsConstructor
public class UserApi {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
