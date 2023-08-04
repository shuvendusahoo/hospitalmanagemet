package com.HospitalManagement.Payload;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Gender is required")
    private String gender;

    @Min(value = 0, message = "Age should not be less than 0")
    private int age;

    private List<AppointmentDto> appointments;
}

