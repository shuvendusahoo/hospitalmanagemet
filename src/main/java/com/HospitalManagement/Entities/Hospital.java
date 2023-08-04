package com.HospitalManagement.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hospitals")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "hospital")
    private List<Appointment> appointments;

    // getters and setters
}

