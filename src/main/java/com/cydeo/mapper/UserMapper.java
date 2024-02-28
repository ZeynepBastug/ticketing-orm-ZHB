package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final ModelMapper modelMapper;

    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    // convertToEntity
    public User convertToEntity (UserDTO user){
        return modelMapper.map(user, User.class);
    }

    //convertToDTO
    public UserDTO convertToDTO (User user){
        return modelMapper.map(user, UserDTO.class);
    }
}
