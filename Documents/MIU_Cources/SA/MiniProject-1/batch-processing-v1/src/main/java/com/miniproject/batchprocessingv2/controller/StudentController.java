package com.miniproject.batchprocessingv2.controller;


import com.miniproject.batchprocessingv2.domain.Student;
import com.miniproject.batchprocessingv2.repository.StudentRepository;
import com.miniproject.batchprocessingv2.service.StudentService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs/students")
public class StudentController {

    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void importCsvToDBJob() {
        studentService.importCsvToDBJob();
    }


    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }


}
