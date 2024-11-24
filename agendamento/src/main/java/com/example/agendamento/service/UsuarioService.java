package com.example.agendamento.service;

import com.example.agendamento.model.Usuario;
import com.example.agendamento.repository.UsuarioRepository; // Corrigido o import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;  // Corrigido o repositório

    public List<Usuario> findAllUsuarios() {
        return usuarioRepository.findAll();  // Corrigido o tipo de retorno
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);  // Criar um novo usuário
    }

    public Usuario findUsuarioById(int id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null);  // Retorna o usuário ou null se não encontrado
    }

    public Usuario updateUsuario(int id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setIdUsuario(id);
            return usuarioRepository.save(usuario);  // Atualiza o usuário
        }
        return null;  // Retorna null se o usuário não existir
    }

    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);  // Exclui o usuário pelo ID
    }
}
