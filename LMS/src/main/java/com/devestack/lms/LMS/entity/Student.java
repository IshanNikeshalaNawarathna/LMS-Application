package com.devestack.lms.LMS.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "student_name", nullable = false,length = 100)
    private String studentName;
    @Column(name = "student_contact",nullable = false)
    private String studentContact;
    @Column(name = "student_address", nullable = false)
    private String studentAddress;


}
