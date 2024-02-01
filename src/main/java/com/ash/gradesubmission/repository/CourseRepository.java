package com.ash.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ash.gradesubmission.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}