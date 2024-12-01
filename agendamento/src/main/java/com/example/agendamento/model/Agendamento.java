package com.example.agendamento.model;

import jakarta.persistence.*;

@Entity
@Table(name = "agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgendamento;


    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idHorario")
    private HorarioAtendimento horario;

    private String status;

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setHorario(HorarioAtendimento horario) {
        this.horario = horario;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
