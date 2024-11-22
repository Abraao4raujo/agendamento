package com.example.agendamento.model;

import java.io.Serializable;

public class ClinicaMedicoId implements Serializable {

    private int medico;
    private int clinica;

    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public int getClinica() {
        return clinica;
    }

    public void setClinica(int clinica) {
        this.clinica = clinica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClinicaMedicoId that = (ClinicaMedicoId) o;

        if (medico != that.medico) return false;
        return clinica == that.clinica;
    }

    @Override
    public int hashCode() {
        int result = medico;
        result = 31 * result + clinica;
        return result;
    }
}
