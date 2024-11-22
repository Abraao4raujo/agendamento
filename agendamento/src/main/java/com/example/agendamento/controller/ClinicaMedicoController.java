package com.example.agendamento.controller;

import com.example.agendamento.model.ClinicaMedico;
import com.example.agendamento.service.ClinicaMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinicaMedico")
public class ClinicaMedicoController {

    @Autowired
    private ClinicaMedicoService clinicaMedicoService;

    @GetMapping
    public List<ClinicaMedico> getAllClinicaMedicos() {
        return clinicaMedicoService.findAllClinicaMedicos();
    }

    @PostMapping
    public ClinicaMedico createClinicaMedico(@RequestBody ClinicaMedico clinicaMedico) {
        return clinicaMedicoService.createClinicaMedico(clinicaMedico);
    }

    @DeleteMapping("/{idMedico}/{idClinica}")
    public void deleteClinicaMedico(@PathVariable int idMedico, @PathVariable int idClinica) {
        clinicaMedicoService.deleteClinicaMedico(idMedico, idClinica);
    }
}
