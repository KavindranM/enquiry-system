package com.enquiry.kavindran.mapper;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.dto.userDto;

public class usermapper {
    public static userDto maptouserDto(User HomeUser){
         return new userDto(
            HomeUser.getId(),
            HomeUser.getFirstName(),
            HomeUser.getLastName(),
            HomeUser.getEmail(),
            HomeUser.getQualification(),
            HomeUser.getIntrest(),
            HomeUser.getPassword()

         );
    }
    public static User maptoUser(userDto userDto){
        return new User(
            userDto.getId(),
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getEmail(),
            userDto.getQualification(),
            userDto.getIntrest(),
            userDto.getPassword()
        );
    }
}
