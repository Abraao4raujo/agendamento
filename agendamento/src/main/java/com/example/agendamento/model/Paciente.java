package com.example.agendamento.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    private LocalDate dataNascimento;
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    // Getters and Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Entity
    @Table(name = "usuario")
    public static class Usuario {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id_usuario")
            private Integer idUsuario;

            @Column(name = "nome", nullable = false, length = 30)
            private String nome;

            @Column(name = "email", nullable = false, unique = true, length = 60)
            private String email;

            @Column(name = "senha", nullable = false, length = 10)
            private String senha;

            @Column(name = "telefone", nullable = false, length = 15)
            private String telefone;

            @Enumerated(EnumType.STRING)
            @Column(name = "sexo", nullable = false)
            private Sexo sexo;

            // Getters e Setters
            public Integer getIdUsuario() {
                    return idUsuario;
            }

            public void setIdUsuario(Integer idUsuario) {
                    this.idUsuario = idUsuario;
            }

            public String getNome() {
                    return nome;
            }

            public void setNome(String nome) {
                    this.nome = nome;
            }

            public String getEmail() {
                    return email;
            }

            public void setEmail(String email) {
                    this.email = email;
            }

            public String getSenha() {
                    return senha;
            }

            public void setSenha(String senha) {
                    this.senha = senha;
            }

            public String getTelefone() {
                    return telefone;
            }

            public void setTelefone(String telefone) {
                    this.telefone = telefone;
            }

            public Sexo getSexo() {
                    return sexo;
            }

            public void setSexo(Sexo sexo) {
                    this.sexo = sexo;
            }

            // Enum para o campo "sexo"
            public enum Sexo {
                    M, F
            }
    }
}
