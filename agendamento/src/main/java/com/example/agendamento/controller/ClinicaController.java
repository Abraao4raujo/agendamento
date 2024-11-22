package com.example.agendamento.controller;

import com.example.agendamento.model.Clinica;
import com.example.agendamento.service.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinicas")
public class ClinicaController {

    @Autowired
    private ClinicaService clinicaService;

    @GetMapping
    public List<Clinica> getAllClinicas() {
        return clinicaService.findAllClinicas();
    }

    @PostMapping
    public Clinica createClinica(@RequestBody Clinica clinica) {
        return clinicaService.createClinica(clinica);
    }

    @GetMapping("/{id}")
    public Clinica getClinicaById(@PathVariable int id) {
        return clinicaService.findClinicaById(id);
    }

    @PutMapping("/{id}")
    public Clinica updateClinica(@PathVariable int id, @RequestBody Clinica clinica) {
        return clinicaService.updateClinica(id, clinica);
    }

    @DeleteMapping("/{id}")
    public void deleteClinica(@PathVariable int id) {
        clinicaService.deleteClinica(id);
    }
}
