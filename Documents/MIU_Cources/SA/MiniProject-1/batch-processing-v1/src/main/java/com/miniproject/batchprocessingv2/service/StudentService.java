package com.miniproject.batchprocessingv2.service;


import com.miniproject.batchprocessingv2.domain.Student;

import java.util.List;

public interface StudentService {

    public void importCsvToDBJob() ;
    public List<Student> findAllStudents();
}
