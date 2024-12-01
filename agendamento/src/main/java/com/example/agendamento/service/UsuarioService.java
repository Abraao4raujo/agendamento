package com.example.agendamento.service;

import com.example.agendamento.model.Usuario;
import com.example.agendamento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario createUsuario(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new IllegalArgumentException("Email já está em uso");
        }

        return usuarioRepository.save(usuario);
    }

    public Usuario findUsuarioById(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null);
    }

    public Usuario updateUsuario(int id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setIdUsuario(id);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

    public boolean verificarCredenciais(String senhaRecebida, String senhaSalva) {
        return senhaRecebida.equals(senhaSalva);
    }
}
