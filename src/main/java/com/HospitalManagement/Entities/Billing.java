package com.HospitalManagement.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "billing")
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private LocalDateTime billingTime;

    // getters and setters
}

