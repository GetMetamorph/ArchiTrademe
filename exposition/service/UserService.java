package domain.service;

import java.util.List;
import java.util.Optional;

import domain.model.User;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    Optional<User> getUserByEmail(String email);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
