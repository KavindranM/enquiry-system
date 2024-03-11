package com.enquiry.kavindran.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.enquiry.kavindran.dto.userDto;

import lombok.AllArgsConstructor;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.Service.services.userService;




@RestController
@AllArgsConstructor
@RequestMapping("/app")
public class userController {

    @Autowired
   userService userService;

    // POST Mapping to create a new user\
    // @PostMapping("/new")
    // @PreAuthorize("hasAuthority('ADMIN')")
    // public ResponseEntity<String> createUser(@RequestBody userDto userDto){
    //     userService.createUser(userDto);
    //     return ResponseEntity.ok().body("User created successfully");
    // }

    // GET Mapping to retrieve a user by its ID

    @GetMapping("/{userId}")
    public ResponseEntity<userDto> getUserById(@PathVariable Long userId) {
        userDto userDto = userService.getUserById(userId);
        if (userDto != null) {
            return ResponseEntity.ok().body(userDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // PUT Mapping to update an existing user
    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody userDto userDto) {
        boolean updated = userService.updateUser(userId, userDto);
        if (updated) {
            return ResponseEntity.ok().body("User updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE Mapping to delete an existing user
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        boolean deleted = userService.deleteUser(userId);
        if (deleted) {
            return ResponseEntity.ok().body("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/allUser")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}