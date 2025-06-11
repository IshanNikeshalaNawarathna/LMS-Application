package com.devestack.lms.LMS.controller;

import com.devestack.lms.LMS.dto.request.RequestStudentDTO;
import com.devestack.lms.LMS.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public String createStudent(@RequestBody RequestStudentDTO studentDTO){
        studentService.createStudent(studentDTO);
        return "Student created";
    }

}
