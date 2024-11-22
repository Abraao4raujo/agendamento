package com.example.agendamento.controller;

import com.example.agendamento.model.HorarioAtendimento;
import com.example.agendamento.service.HorarioAtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioAtendimentoController {

    @Autowired
    private HorarioAtendimentoService horarioAtendimentoService;

    @GetMapping
    public List<HorarioAtendimento> getAllHorarios() {
        return horarioAtendimentoService.findAllHorarios();
    }

    @PostMapping
    public HorarioAtendimento createHorario(@RequestBody HorarioAtendimento horarioAtendimento) {
        return horarioAtendimentoService.createHorario(horarioAtendimento);
    }
}
