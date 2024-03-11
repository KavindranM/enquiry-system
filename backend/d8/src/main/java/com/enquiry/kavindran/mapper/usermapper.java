package com.enquiry.kavindran.mapper;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.dto.userDto;

public class usermapper {
    public static userDto maptouserDto(User HomeUser){
         return new userDto(
            HomeUser.getId(),
            HomeUser.getName(),
            HomeUser.getEmail(),
            HomeUser.getPassword(),
            HomeUser.getUserInfo()

         );
    }
    public static User maptoUser(userDto userDto){
        return new User(
            userDto.getId(),
            userDto.getName(),
            userDto.getEmail(),
            userDto.getPassword(),
            userDto.getUserInfo()
        );
    }
}
