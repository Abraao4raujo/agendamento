package com.example.agendamento.usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

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
