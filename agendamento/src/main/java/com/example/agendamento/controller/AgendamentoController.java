package com.example.agendamento.controller;

import com.example.agendamento.model.Agendamento;
import com.example.agendamento.model.HorarioAtendimento;
import com.example.agendamento.model.Medico;
import com.example.agendamento.model.Paciente;
import com.example.agendamento.service.AgendamentoService;
import com.example.agendamento.service.PacienteService;
import com.example.agendamento.service.MedicoService;
import com.example.agendamento.service.HorarioAtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private HorarioAtendimentoService horarioAtendimentoService;

    @PostMapping
    public Agendamento createAgendamento(
            @RequestParam int idPaciente,
            @RequestParam int idMedico,
            @RequestParam int idHorario,
            @RequestBody Agendamento agendamento) {

        Paciente paciente = pacienteService.findPacienteById(idPaciente);
        Medico medico = medicoService.findMedicoById(idMedico);
        HorarioAtendimento horarioAtendimento = horarioAtendimentoService.findById(idHorario);

        if (horarioAtendimento == null) {
            throw new IllegalArgumentException("Horário não encontrado.");
        }

        agendamento.setPaciente(paciente);
        agendamento.setMedico(medico);
        agendamento.setHorario(horarioAtendimento);

        return agendamentoService.createAgendamento(agendamento);
    }

    @GetMapping
    public List<Agendamento> getAllAgendamentos() {
        return agendamentoService.findAllAgendamentos();
    }
}
