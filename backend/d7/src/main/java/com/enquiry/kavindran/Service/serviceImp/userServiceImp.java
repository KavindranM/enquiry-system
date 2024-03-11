package com.enquiry.kavindran.Service.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.Repository.userRepo;
import com.enquiry.kavindran.Service.services.userService;
import com.enquiry.kavindran.dto.userDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class userServiceImp implements userService {
    private final userRepo userRepo;

    @Override
    public void createUser(userDto userDto) {
        User appuser = new User();
        appuser.setName(userDto.getName());
        appuser.setPassword(userDto.getPassword());
        userRepo.save(appuser);
    }

    @Override
    public userDto getUserById(Long userId) {
        User appuser = userRepo.findById(userId).orElse(null);
        if (appuser != null) {
            return new userDto(appuser.getId(), appuser.getName(), appuser.getPassword(),appuser.getEmail(),appuser.getUserInfo());
        } else {
            return null;
        }
    }

    @Override
    public boolean updateUser(Long userId, userDto userDto) {
        User existingUser = userRepo.findById(userId).orElse(null);
        if (existingUser != null) {
            existingUser.setName(userDto.getName());
            existingUser.setPassword(userDto.getPassword());
            userRepo.save(existingUser);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteUser(Long userId) {
        if (userRepo.existsById(userId)) {
            userRepo.deleteById(userId);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}