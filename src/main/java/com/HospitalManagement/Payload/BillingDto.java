package com.HospitalManagement.Payload;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillingDto {
    private Long id;

    @NotNull(message = "Appointment is required")
    private AppointmentDto appointment;

    @Min(value = 0, message = "Amount should not be less than 0")
    private double amount;

    @NotNull(message = "Billing time is required")
    private LocalDateTime billingTime;
}

