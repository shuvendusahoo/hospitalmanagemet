package com.HospitalManagement.Service;

import com.HospitalManagement.Payload.NurseDto;

import java.util.List;

public interface NurseService {
    List<NurseDto> getAllNurses();
    NurseDto getNurseById(Long id);
    NurseDto createNurse(NurseDto nurseDto);
    NurseDto updateNurse(Long id, NurseDto nurseDto);
    void deleteNurse(Long id);
}

