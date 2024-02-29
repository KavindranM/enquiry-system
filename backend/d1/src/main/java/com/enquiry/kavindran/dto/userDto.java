package com.enquiry.kavindran.dto;

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
    private String firstName;
    private String lastName;
    private String email;
    private String qualification;
    private String intrest;
    private String password;
}
