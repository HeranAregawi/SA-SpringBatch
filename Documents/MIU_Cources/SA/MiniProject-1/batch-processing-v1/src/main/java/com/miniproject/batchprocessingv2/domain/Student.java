package com.miniproject.batchprocessingv2.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Integer id;

    @Column(name = "First")
    private String first;

    @Column(name = "Last")
    private String last;

    @Column(name = "GPA")
    private Double gpa;

    @Column(name = "DOB")
    private String dob;


}
