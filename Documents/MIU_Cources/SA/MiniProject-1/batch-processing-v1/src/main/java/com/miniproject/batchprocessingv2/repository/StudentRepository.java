package com.miniproject.batchprocessingv2.repository;


import com.miniproject.batchprocessingv2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
