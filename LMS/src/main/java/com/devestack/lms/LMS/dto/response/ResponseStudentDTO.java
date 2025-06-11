package com.devestack.lms.LMS.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseStudentDTO {
    private String id;
    private String name;
    private String contact;
    private String address;
}
