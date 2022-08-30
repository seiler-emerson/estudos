package com.emerson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emerson.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
    

}
