package com.example.agendamento.controller;

import com.example.agendamento.model.Clinica;
import com.example.agendamento.model.Usuario;
import com.example.agendamento.service.ClinicaService;
import com.example.agendamento.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinicas")
public class ClinicaController {

    @Autowired
    private ClinicaService clinicaService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Clinica> getAllClinicas() {
        return clinicaService.findAllClinicas();
    }

    @PostMapping
    public Clinica createClinica(@RequestBody Clinica clinica) {
        System.out.println("Razão Social recebida: " + clinica.getRazaoSocial());
        Usuario usuario = clinica.getUsuario();
        if (usuario == null) {
            throw new RuntimeException("Usuário não foi fornecido para a clínica");
        }

        Usuario usuarioExistente = usuarioService.findUsuarioById(usuario.getIdUsuario());
        if (usuarioExistente != null) {
            return clinicaService.save(clinica);
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }

    @GetMapping("/{id}")
    public Clinica getClinicaById(@PathVariable int id) {
        return clinicaService.findClinicaById(id);
    }

    @PutMapping("/{id}")
    public Clinica updateClinica(@PathVariable int id, @RequestBody Clinica clinica) {
        return clinicaService.updateClinica(id, clinica);
    }

    @DeleteMapping("/{id}")
    public void deleteClinica(@PathVariable int id) {
        clinicaService.deleteClinica(id);
    }
}
