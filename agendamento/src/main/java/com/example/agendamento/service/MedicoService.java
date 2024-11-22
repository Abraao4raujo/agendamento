package com.example.agendamento.service;

import com.example.agendamento.model.Medico;
import com.example.agendamento.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> findAllMedicos() {
        return medicoRepository.findAll();
    }

    public Medico createMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public Medico findMedicoById(int id) {
        Optional<Medico> medico = medicoRepository.findById(id);
        return medico.orElse(null);
    }

    public Medico updateMedico(int id, Medico medico) {
        if (medicoRepository.existsById(id)) {
            medico.setIdMedico(id);
            return medicoRepository.save(medico);
        }
        return null;
    }

    public void deleteMedico(int id) {
        medicoRepository.deleteById(id);
    }
}
