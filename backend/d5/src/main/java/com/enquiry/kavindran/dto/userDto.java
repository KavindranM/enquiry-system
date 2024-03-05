package com.enquiry.kavindran.dto;

import com.enquiry.kavindran.Model.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class userDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserInfo userInfo;
}
