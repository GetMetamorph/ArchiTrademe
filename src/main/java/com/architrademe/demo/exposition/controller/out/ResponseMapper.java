package com.architrademe.demo.exposition.controller.out;

import com.architrademe.demo.domain.model.User;
import com.architrademe.demo.exposition.controller.in.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class ResponseMapper {
    public UserDTOResponse map(User user) {
        UserDTOResponse userDto = new UserDTOResponse();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setPhone(user.getPhone());

        return userDto;
    }

    public ResponseDTO<UserDTO> toResponseDTO(UserDTO userDTO, String message) {
        UserDTOResponse userResponse = map(userDTO.toDomainModel());
        ResponseDTO<UserDTO> response = new ResponseDTO<>(message,userDTO);
        response.setData(userDTO);
        response.setMessage(message);
        response.setSuccess(true);

        return response;
    }

    public ResponseDTO<UserDTO> toErrorResponseDTO(UserDTO userDTO, String errorMessage) {
        ResponseDTO<UserDTO> response = new ResponseDTO<>(errorMessage,userDTO);
        response.setData(userDTO);
        response.setMessage(errorMessage);
        response.setSuccess(false);

        return response;
    }
}
