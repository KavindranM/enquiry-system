package com.enquiry.kavindran.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.enquiry.kavindran.Model.UserInfo;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

}
