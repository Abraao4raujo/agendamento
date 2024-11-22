package com.example.agendamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(ClinicaMedicoId.class)
public class ClinicaMedico {

    @Id
    @ManyToOne
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @Id
    @ManyToOne
    @JoinColumn(name = "idClinica")
    private Clinica clinica;

    // Getters and Setters
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
