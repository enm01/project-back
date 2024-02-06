package com.imane.projectsocleback.services;

import com.imane.projectsocleback.entities.User;
import com.imane.projectsocleback.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class UserService {

        private final UserRepository userRepository;

        @Autowired
        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }


        public User authenticate(String username, String password) {
            User user = userRepository.findByUsername(username);

            if (user != null && user.getPassword().equals(password)) {
                return user;
            }

            return null; // Authentication failed
        }



    }