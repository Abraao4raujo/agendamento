package com.example.agendamento.service;

import com.example.agendamento.model.Paciente;
import com.example.agendamento.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAllPacientes() {
        return pacienteRepository.findAll();
    }

    public Paciente createPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente findPacienteById(int id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        return paciente.orElse(null);
    }

    public Paciente updatePaciente(int id, Paciente paciente) {
        if (pacienteRepository.existsById(id)) {
            paciente.setIdPaciente(id);
            return pacienteRepository.save(paciente);
        }
        return null;
    }

    public void deletePaciente(int id) {
        pacienteRepository.deleteById(id);
    }
}
