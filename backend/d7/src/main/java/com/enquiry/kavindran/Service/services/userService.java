package com.enquiry.kavindran.Service.services;

import java.util.List;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.dto.userDto;

public interface userService {
    void createUser(userDto userDto);
    userDto getUserById(Long userId);
    boolean updateUser(Long userId, userDto userDto);
    boolean deleteUser(Long userId);
    List<User> getAllUser();
}

