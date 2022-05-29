package com.miniproject.batchprocessingv2.batchconfig.springbatchconfig;

import com.miniproject.batchprocessingv2.domain.Student;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        LocalDate now = LocalDate.now();
        int year = now.getYear() - parseInt(student.getDob());
        student.setDob(LocalDate.of(year, 1, 1).toString());
        return student;
    }
}
