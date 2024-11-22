package com.example.agendamento.repository;

import com.example.agendamento.model.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicaRepository extends JpaRepository<Clinica, Integer> {
}