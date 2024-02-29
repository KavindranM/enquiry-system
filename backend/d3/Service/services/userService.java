package com.enquiry.kavindran.Service.services;

import java.util.List;

import com.enquiry.kavindran.dto.userDto;

public interface userService {
     userDto createUser(userDto userDto);

     userDto getUserById(Long Id);
     
    List<userDto> getAllUsers();
} 
