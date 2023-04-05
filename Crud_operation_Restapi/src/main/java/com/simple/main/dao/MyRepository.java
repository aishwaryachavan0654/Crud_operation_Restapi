package com.simple.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simple.main.model.Student;

@Repository
public interface MyRepository extends JpaRepository<Student, Integer> {

}
