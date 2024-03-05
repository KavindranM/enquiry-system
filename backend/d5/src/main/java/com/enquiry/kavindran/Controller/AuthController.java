package com.enquiry.kavindran.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;

import com.enquiry.kavindran.Model.User;
import com.enquiry.kavindran.Model.UserInfo;
import com.enquiry.kavindran.Model.admin;
import com.enquiry.kavindran.Repository.AdminRepo;
import com.enquiry.kavindran.Repository.UserInfoRepository;
import com.enquiry.kavindran.Repository.userRepo;
import com.enquiry.kavindran.Service.services.JwtService;
import com.enquiry.kavindran.dto.AuthRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

   @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private JwtService jwtService;

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private userRepo userRepo;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        if(userInfo.getRoles().equals("ADMIN" ) ||userInfo.getRoles().equals("admin" )){
            admin admin=new admin();
            admin.setUserInfo(userInfo);
            admin.setName(userInfo.getName());
            admin.setEmail(userInfo.getEmail());
            admin.setPassword(userInfo.getPassword());
            adminRepo.save(admin);
        }
        else{
            User app_User=new User();
            app_User.setUserInfo(userInfo);
            app_User.setName(userInfo.getName());
            app_User.setEmail(userInfo.getEmail());
            app_User.setPassword(userInfo.getPassword());
            userRepo.save(app_User);
        }
        return "user added to system ";
    }

    
    @PostMapping("/auth")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }

    }
}
