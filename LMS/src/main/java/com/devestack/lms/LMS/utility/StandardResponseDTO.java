package com.devestack.lms.LMS.utility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StandardResponseDTO {
    private String code;
    private String message;
    private Object data;

}
