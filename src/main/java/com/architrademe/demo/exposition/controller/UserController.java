package com.architrademe.demo.exposition.controller;

import com.architrademe.demo.domain.model.User;
import com.architrademe.demo.domain.service.UserService;
import com.architrademe.demo.exposition.controller.in.UserDTO;
import com.architrademe.demo.exposition.controller.out.ResponseDTO;
import com.architrademe.demo.exposition.controller.out.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;
    private final ResponseMapper responseMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper, ResponseMapper responseMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
        this.responseMapper = responseMapper;
    }

    @PostMapping("")
    public ResponseEntity<ResponseDTO<UserDTO>> createUser(@RequestParam String name, @RequestParam String surname, @RequestParam String email, @RequestParam String phone, @RequestParam String password) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setSurname(surname);
        userDTO.setEmail(email);
        userDTO.setPhone(phone);
        userDTO.setPassword(password);

        User user = userMapper.toDomainModel(userDTO);
        userService.addUser(user);

        ResponseDTO<UserDTO> response = responseMapper.toResponseDTO(userDTO, "User created successfully");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
