package com.enquiry.kavindran.Service.serviceImp;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.Repository.userRepo;
import com.enquiry.kavindran.Service.services.userService;
import com.enquiry.kavindran.dto.userDto;
import com.enquiry.kavindran.exception.ResourceNotFoundException;
import com.enquiry.kavindran.mapper.usermapper;

@Service
public class userServiceImp implements userService {
   
    @Autowired
    private userRepo userRepository;

   

@Override
    public userDto createUser(userDto userDto){
        User HomeUser = usermapper.maptoUser(userDto);
        User savedUser = userRepository.save(HomeUser);
        return usermapper.maptouserDto(savedUser);

    }
@Override
    public userDto getUserById(Long Id) {
        User user = userRepository.findById(Id)
                .orElseThrow(()-> new ResourceNotFoundException("User is not exist with given id : " + Id));

        return usermapper.maptouserDto(user);
    }
     public List<userDto> getAllUsers() {
        List<User> usersList = userRepository.findAll();

        List<userDto> usersDtos = new ArrayList<>();
        for (User user: usersList) {
            usersDtos.add(usermapper.maptouserDto(user));
        }

        return usersDtos;
    }
    
}
