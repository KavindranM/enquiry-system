package com.enquiry.kavindran.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enquiry.kavindran.Service.services.userService;
import com.enquiry.kavindran.dto.userDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class userController {
    private userService userService;

    @GetMapping("{id}")
    public ResponseEntity<userDto> getUserId(@PathVariable("id") Long id){
        userDto userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);
    }

     @PostMapping("/post")
    public ResponseEntity<userDto> createUser(@RequestBody userDto userDto) {
        userDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<userDto>> getAllUsers() {
        List<userDto> user = userService.getAllUsers();
        return ResponseEntity.ok(user);
    }
}
