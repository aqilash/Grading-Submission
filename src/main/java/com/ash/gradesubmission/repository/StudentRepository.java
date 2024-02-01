package com.ash.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ash.gradesubmission.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}