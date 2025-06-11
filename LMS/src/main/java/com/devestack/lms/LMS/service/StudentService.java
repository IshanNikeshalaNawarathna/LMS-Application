package com.devestack.lms.LMS.service;

import com.devestack.lms.LMS.dto.request.RequestStudentDTO;
import com.devestack.lms.LMS.dto.response.ResponseStudentDTO;

import java.util.List;

public interface StudentService {
    public void createStudent(RequestStudentDTO requestStudentDTO);
    public List<ResponseStudentDTO> allStudents();
    public ResponseStudentDTO findById(String id);
}
