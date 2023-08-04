package com.HospitalManagement.Payload;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {
    private Long id;

    @NotNull(message = "Patient is required")
    private PatientDto patient;

    @NotNull(message = "Doctor is required")
    private DoctorDto doctor;

    @NotNull(message = "Nurse is required")
    private NurseDto nurse;

    @NotNull(message = "Hospital is required")
    private HospitalDto hospital;

    @NotNull(message = "Appointment time is required")
    private LocalDateTime appointmentTime;

    private boolean isCancelled;

    private MedicineDto medicine;
}

