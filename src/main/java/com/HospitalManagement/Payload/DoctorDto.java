package com.HospitalManagement.Payload;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

        @NotBlank(message = "Specialization is required")
        private String specialization;

    private List<AppointmentDto> appointments;
}

