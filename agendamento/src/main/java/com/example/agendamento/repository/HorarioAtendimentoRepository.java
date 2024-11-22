package com.example.agendamento.repository;

import com.example.agendamento.model.HorarioAtendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioAtendimentoRepository extends JpaRepository<HorarioAtendimento, Integer> {
}
