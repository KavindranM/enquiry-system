package com.enquiry.kavindran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enquiry.kavindran.Model.User;

@Repository
public interface userRepo extends JpaRepository<User, Long> {
    
}
