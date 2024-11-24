package com.example.agendamento.repository;

import com.example.agendamento.model.Medico;
import com.example.agendamento.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {
    @Repository("usuarioRepository")
    interface UsuarioRepository extends JpaRepository<Paciente.Usuario, Integer> {
    }
}
