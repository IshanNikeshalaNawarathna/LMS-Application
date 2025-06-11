package com.devestack.lms.LMS.service.impl;

import com.devestack.lms.LMS.dto.request.RequestStudentDTO;
import com.devestack.lms.LMS.dto.response.ResponseStudentDTO;
import com.devestack.lms.LMS.entity.Student;
import com.devestack.lms.LMS.repo.StudentRepo;
import com.devestack.lms.LMS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void createStudent(RequestStudentDTO requestStudentDTO) {
        studentRepo.save(toStudent(requestStudentDTO));
    }

    @Override
    public List<ResponseStudentDTO> allStudents() {
//        List<Student> all = studentRepo.findAll();
//        List<ResponseStudentDTO> responseStudentDTOList = new ArrayList<>();
//        for (Student student : all) {
//            responseStudentDTOList.add(toResponseStudentDto(student));
//        }
//        return responseStudentDTOList;

       // return studentRepo.findAll().stream().map(e->toResponseStudentDto(e)).toList();

        return studentRepo.findAll().stream().map(this::toResponseStudentDto).toList();

    }

    @Override
    public ResponseStudentDTO findById(String id) {
        Student student = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return toResponseStudentDto(student);
    }

    private ResponseStudentDTO toResponseStudentDto(Student student){
        if(student == null) return null;
        return ResponseStudentDTO.builder()
                .id(student.getId())
                .name(student.getStudentName())
                .address(student.getStudentAddress())
                .contact(student.getStudentContact()).build();
    }

    private Student toStudent(RequestStudentDTO requestStudentDTO) {
        return Student.builder()
                .studentName(requestStudentDTO.getName())
                .studentContact(requestStudentDTO.getContact())
                .studentAddress(requestStudentDTO.getAddress())
                .build();
    }
}
