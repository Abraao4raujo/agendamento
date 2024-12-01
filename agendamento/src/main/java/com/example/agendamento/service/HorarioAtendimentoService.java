package com.example.agendamento.service;

import com.example.agendamento.model.HorarioAtendimento;
import com.example.agendamento.repository.HorarioAtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioAtendimentoService {

    @Autowired
    private HorarioAtendimentoRepository horarioAtendimentoRepository;

    public HorarioAtendimento findById(int id) {
        Optional<HorarioAtendimento> horarioAtendimento = horarioAtendimentoRepository.findById(id);
        return horarioAtendimento.orElse(null); // Retorna null caso não encontre o horário
    }

    public List<HorarioAtendimento> findAllHorarios() {
        return horarioAtendimentoRepository.findAll();
    }

    public HorarioAtendimento createHorario(HorarioAtendimento horarioAtendimento) {
        return horarioAtendimentoRepository.save(horarioAtendimento);
    }
}
