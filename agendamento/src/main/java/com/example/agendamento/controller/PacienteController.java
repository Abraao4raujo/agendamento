package com.example.agendamento.controller;

import com.example.agendamento.model.Paciente;
import com.example.agendamento.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return pacienteService.findAllPacientes();
    }

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        return pacienteService.createPaciente(paciente);
    }

    @GetMapping("/{id}")
    public Paciente getPacienteById(@PathVariable int id) {
        return pacienteService.findPacienteById(id);
    }

    @PutMapping("/{id}")
    public Paciente updatePaciente(@PathVariable int id, @RequestBody Paciente paciente) {
        return pacienteService.updatePaciente(id, paciente);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable int id) {
        pacienteService.deletePaciente(id);
    }
}
