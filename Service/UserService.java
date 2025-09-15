package com.waste.waste_management.service;

import com.waste.waste_management.domain.User;
import com.waste.waste_management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // Create or Update User
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Delete user by ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Find by username
    public Optional<User> getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Find users by role
    public List<User> getUsersByRole(String role) {
        return userRepository.findByRole(role);
    }
}
