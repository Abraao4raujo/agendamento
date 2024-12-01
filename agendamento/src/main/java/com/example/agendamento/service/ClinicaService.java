package com.example.agendamento.service;

import com.example.agendamento.model.Clinica;
import com.example.agendamento.repository.ClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicaService {

    @Autowired
    private ClinicaRepository clinicaRepository;

    public Clinica save(Clinica clinica) {
        return clinicaRepository.save(clinica);
    }

    public List<Clinica> findAllClinicas() {
        return clinicaRepository.findAll();
    }

    public Clinica createClinica(Clinica clinica) {
        return clinicaRepository.save(clinica);
    }

    public Clinica findClinicaById(int id) {
        Optional<Clinica> clinica = clinicaRepository.findById(id);
        return clinica.orElse(null);
    }

    public Clinica updateClinica(int id, Clinica clinica) {
        if (clinicaRepository.existsById(id)) {
            clinica.setIdClinica(id);
            return clinicaRepository.save(clinica);
        }
        return null;
    }

    public void deleteClinica(int id) {
        clinicaRepository.deleteById(id);
    }
}
