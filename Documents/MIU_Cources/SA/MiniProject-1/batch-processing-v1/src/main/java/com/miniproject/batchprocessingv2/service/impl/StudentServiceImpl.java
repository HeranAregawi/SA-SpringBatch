package com.miniproject.batchprocessingv2.service.impl;

import com.miniproject.batchprocessingv2.domain.Student;
import com.miniproject.batchprocessingv2.repository.StudentRepository;
import com.miniproject.batchprocessingv2.service.StudentService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void importCsvToDBJob() {
        {
            JobParameters jobParameters = new JobParametersBuilder()
                    .addLong("startAt", System.currentTimeMillis()).toJobParameters();
            try {
                jobLauncher.run(job, jobParameters);
            } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException |
                     JobParametersInvalidException e) {
                e.printStackTrace();

            }
        }

    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
