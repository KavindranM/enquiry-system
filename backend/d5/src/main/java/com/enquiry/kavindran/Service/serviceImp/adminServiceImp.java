package com.enquiry.kavindran.Service.serviceImp;




import org.springframework.stereotype.Service;


import com.enquiry.kavindran.Model.admin;
import com.enquiry.kavindran.Repository.AdminRepo;

import com.enquiry.kavindran.Service.services.adminService;
import com.enquiry.kavindran.dto.adminDto;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class adminServiceImp implements adminService{

    private final AdminRepo adminRepo;

    @Override
    public void createAdmin(adminDto adminDto) {
        admin appuser = new admin();
        appuser.setName(adminDto.getName());
        appuser.setPassword(adminDto.getPassword());
        adminRepo.save(appuser);
    }

    @Override
    public adminDto getAdminById(Long userId) {
        admin appuser = adminRepo.findById(userId).orElse(null);
        if (appuser != null) {
            return new adminDto(appuser.getId(), appuser.getName(), appuser.getPassword(),appuser.getEmail(),appuser.getUserInfo());
        } else {
            return null;
        }
    }

    @Override
    public boolean updateAdmin(Long userId, adminDto adminDto) {
        admin existingUser = adminRepo.findById(userId).orElse(null);
        if (existingUser != null) {
            existingUser.setName(adminDto.getName());
            existingUser.setPassword(adminDto.getPassword());
            adminRepo.save(existingUser);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteAdmin(Long userId) {
        if (adminRepo.existsById(userId)) {
            adminRepo.deleteById(userId);
            return true;
        } else {
            return false;
        }
    }
}
