package com.example.agendamento;

import com.example.agendamento.conexoes.ConexaoSQLite;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendamentoApplication {

	public static void main(String[] args) {
		ConexaoSQLite.connect();
		SpringApplication.run(AgendamentoApplication.class, args);
	}

}
