package com.enquiry.kavindran.mapper;


import com.enquiry.kavindran.Model.course;
import com.enquiry.kavindran.dto.courseDto;

public class courseMapper {
     public static courseDto maptoCourseDto(course course){
         return new courseDto(
            course.getCourseId(),
            course.getName(),
            course.getDescription(),
            course.getDuration()
           
         );
    }
    public static course maptoCourse(courseDto courseDto){
        return new course(
            courseDto.getCourseId(),
            courseDto.getName(),
            courseDto.getDescription(),
            courseDto.getDuration()
           
        );
    }
}
