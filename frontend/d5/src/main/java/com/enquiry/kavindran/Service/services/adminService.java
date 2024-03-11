package com.enquiry.kavindran.Service.services;

import com.enquiry.kavindran.dto.adminDto;

public interface adminService {

     void createAdmin(adminDto adminDto);
    adminDto getAdminById(Long userId);
    boolean updateAdmin(Long userId, adminDto adminDto);
    boolean deleteAdmin(Long userId);

}
