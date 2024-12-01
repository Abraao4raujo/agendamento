package com.example.agendamento.service;

import com.example.agendamento.model.ClinicaMedico;
import com.example.agendamento.repository.ClinicaMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicaMedicoService {

    @Autowired
    private ClinicaMedicoRepository clinicaMedicoRepository;

    public List<ClinicaMedico> findAllClinicaMedicos() {
        return clinicaMedicoRepository.findAll();
    }

    public ClinicaMedico createClinicaMedico(ClinicaMedico clinicaMedico) {
        return clinicaMedicoRepository.save(clinicaMedico);
    }
}
