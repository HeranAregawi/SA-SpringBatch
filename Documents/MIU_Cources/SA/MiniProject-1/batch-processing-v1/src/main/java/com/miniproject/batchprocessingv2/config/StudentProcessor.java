package com.miniproject.batchprocessingv2.config;
import com.miniproject.batchprocessingv2.domain.Student;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        LocalDate now = LocalDate.now();
        int year = now.getYear() - student.getDob();
        student.setDob(year);
        return student;
    }
}
