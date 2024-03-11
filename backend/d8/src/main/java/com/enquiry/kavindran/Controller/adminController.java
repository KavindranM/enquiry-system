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

import com.enquiry.kavindran.dto.adminDto;
import lombok.AllArgsConstructor;





@RestController
@AllArgsConstructor
@RequestMapping("/app/admin")
public class adminController {

    @Autowired
   com.enquiry.kavindran.Service.services.adminService adminService;

    // POST Mapping to create a new user
    @PostMapping("/new")
    public ResponseEntity<String> createUser(@RequestBody adminDto adminDto){
        adminService.createAdmin(adminDto);
        return ResponseEntity.ok().body("User created successfully");
    }

    // GET Mapping to retrieve a user by its ID
    @GetMapping("/{userId}")
    // @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<adminDto> getAdminById(@PathVariable Long userId) {
        adminDto adminDto = adminService.getAdminById(userId);
        if (adminDto != null) {
            return ResponseEntity.ok().body(adminDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // PUT Mapping to update an existing user
    @PutMapping("/{userId}")
    // @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody adminDto adminDto) {
        boolean updated = adminService.updateAdmin(userId, adminDto);
        if (updated) {
            return ResponseEntity.ok().body("User updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE Mapping to delete an existing user
    @DeleteMapping("/{userId}")
    // @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        boolean deleted = adminService.deleteAdmin(userId);
        if (deleted) {
            return ResponseEntity.ok().body("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}