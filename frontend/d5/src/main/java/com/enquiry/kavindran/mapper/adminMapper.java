package com.enquiry.kavindran.mapper;

import com.enquiry.kavindran.Model.admin;
import com.enquiry.kavindran.dto.adminDto;


public class adminMapper {
   
    public static adminDto maptoAdminDto(admin admin){
         return new adminDto(
            admin.getId(),
            admin.getName(),
            admin.getEmail(),
            admin.getPassword(),
            admin.getUserInfo()

         );
    }
    public static admin maptoUser(adminDto adminDto){
        return new admin(
            adminDto.getId(),
            adminDto.getName(),
            adminDto.getEmail(),
            adminDto.getPassword(),
            adminDto.getUserInfo()
        );
    }
}
 

