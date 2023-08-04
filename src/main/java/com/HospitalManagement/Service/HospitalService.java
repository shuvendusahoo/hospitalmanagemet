package com.HospitalManagement.Service;

import com.HospitalManagement.Payload.HospitalDto;

import java.util.List;

public interface HospitalService {
    List<HospitalDto> getAllHospitals();
    HospitalDto getHospitalById(Long id);
    HospitalDto createHospital(HospitalDto hospitalDto);
    HospitalDto updateHospital(Long id, HospitalDto hospitalDto);
    void deleteHospital(Long id);
}

