package com.HospitalManagement.ServiceImpl;

import com.HospitalManagement.Entities.Nurse;
import com.HospitalManagement.Exception.ResourceNotFoundException;
import com.HospitalManagement.Payload.NurseDto;
import com.HospitalManagement.Repository.NurseRepository;
import com.HospitalManagement.Service.NurseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class NurseServiceImpl implements NurseService {

    @Autowired
    private NurseRepository nurseRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<NurseDto> getAllNurses() {
        List<Nurse> nurses = nurseRepository.findAll();
        return nurses.stream()
                .map(nurse -> modelMapper.map(nurse, NurseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public NurseDto getNurseById(Long id) {
        Nurse nurse = nurseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Nurse", "id", id));
        return modelMapper.map(nurse, NurseDto.class);
    }

    @Override
    public NurseDto createNurse(NurseDto nurseDto) {
        Nurse nurse = modelMapper.map(nurseDto, Nurse.class);
        nurse = nurseRepository.save(nurse);
        return modelMapper.map(nurse, NurseDto.class);
    }

    @Override
    public NurseDto updateNurse(Long id, NurseDto nurseDto) {
        Nurse nurse = nurseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Nurse", "id", id));
        modelMapper.map(nurseDto, nurse);
        nurse = nurseRepository.save(nurse);
        return modelMapper.map(nurse, NurseDto.class);
    }

    @Override
    public void deleteNurse(Long id) {
        Nurse nurse = nurseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Nurse", "id", id));
        nurseRepository.delete(nurse);
    }
}

