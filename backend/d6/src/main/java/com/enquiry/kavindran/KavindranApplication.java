package com.enquiry.kavindran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.enquiry.kavindran.Repository.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class KavindranApplication {

	public static void main(String[] args) {
		SpringApplication.run(KavindranApplication.class, args);
	}

}
