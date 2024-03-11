package com.enquiry.kavindran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enquiry.kavindran.Model.admin;

public interface AdminRepo extends JpaRepository<admin,Long>{
    
}
