package com.ash.gradesubmission.service;

import java.util.List;

import com.ash.gradesubmission.entity.Course;

public interface CourseService {
    Course getCourse(Long id);

    Course saveCourse(Course course, Long studentId);

    void deleteCourse(Long id);

    List<Course> getCourses();
}