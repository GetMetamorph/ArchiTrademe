package com.architrademe.demo.exposition.controller;

import com.architrademe.demo.domain.model.User;
import com.architrademe.demo.exposition.controller.in.UserDTO;
import com.architrademe.demo.exposition.controller.out.UserDTOResponse;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {
    public static User toDomainModel(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setPassword(userDTO.getPassword());
        return user;
    }

    public static UserDTOResponse toDTO(User user) {
        UserDTOResponse userDTO = new UserDTOResponse();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setEmail(user.getEmail());
        user.setPhone(user.getPhone());
        user.setPassword(user.getPassword());
        return userDTO;
    }
}
