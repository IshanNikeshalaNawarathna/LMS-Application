package com.devestack.lms.LMS.controller;

import com.devestack.lms.LMS.dto.request.RequestStudentDTO;
import com.devestack.lms.LMS.service.StudentService;
import com.devestack.lms.LMS.utility.StandardResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StandardResponseDTO> createStudent(@RequestBody RequestStudentDTO studentDTO){
        studentService.createStudent(studentDTO);
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        201,
                        "Student Created",
                        null
                ),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<StandardResponseDTO> getAllStudent(){
        return new ResponseEntity<>(
                new StandardResponseDTO(
                        200,
                        "All Students",
                        studentService.allStudents()

                ),
                HttpStatus.OK
        );
    }

}
