package com.HospitalManagement.Controller;

import com.HospitalManagement.Payload.NurseDto;
import com.HospitalManagement.Service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/nurses")
public class NurseController {

    @Autowired
    private NurseService nurseService;

    @GetMapping
    public List<NurseDto> getAllNurses() {
        return nurseService.getAllNurses();
    }

    @GetMapping("/{id}")
    public NurseDto getNurseById(@PathVariable Long id) {
        return nurseService.getNurseById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NurseDto createNurse(@Valid @RequestBody NurseDto nurseDto) {
        return nurseService.createNurse(nurseDto);
    }

    @PutMapping("/{id}")
    public NurseDto updateNurse(@PathVariable Long id, @Valid @RequestBody NurseDto nurseDto) {
        return nurseService.updateNurse(id, nurseDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNurse(@PathVariable Long id) {
        nurseService.deleteNurse(id);
    }
}

