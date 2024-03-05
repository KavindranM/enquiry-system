package com.enquiry.kavindran.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enquiry.kavindran.Model.course;

public interface courseRepo extends JpaRepository<course,Long> {
    
}
