package com.example.agendamento.repository;

import com.example.agendamento.model.ClinicaMedico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicaMedicoRepository extends JpaRepository<ClinicaMedico, Integer> {
}
