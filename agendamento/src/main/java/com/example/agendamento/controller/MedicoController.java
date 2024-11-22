package com.example.agendamento.controller;

import com.example.agendamento.model.Medico;
import com.example.agendamento.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.findAllMedicos();
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoService.createMedico(medico);
    }

    @GetMapping("/{id}")
    public Medico getMedicoById(@PathVariable int id) {
        return medicoService.findMedicoById(id);
    }

    @PutMapping("/{id}")
    public Medico updateMedico(@PathVariable int id, @RequestBody Medico medico) {
        return medicoService.updateMedico(id, medico);
    }

    @DeleteMapping("/{id}")
    public void deleteMedico(@PathVariable int id) {
        medicoService.deleteMedico(id);
    }
}
