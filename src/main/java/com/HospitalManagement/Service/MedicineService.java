package com.HospitalManagement.Service;

import com.HospitalManagement.Payload.MedicineDto;

import java.util.List;

public interface MedicineService {
    List<MedicineDto> getAllMedicines();
    MedicineDto getMedicineById(Long id);
    MedicineDto createMedicine(MedicineDto medicineDto);
    MedicineDto updateMedicine(Long id, MedicineDto medicineDto);
    void deleteMedicine(Long id);
}

