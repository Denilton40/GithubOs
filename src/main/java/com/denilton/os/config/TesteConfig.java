package com.denilton.os.config;

//import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//import com.denilton.os.domain.Cliente;
//import com.denilton.os.domain.OS;
//import com.denilton.os.domain.Tecnico;
//import com.denilton.os.domain.enuns.Prioridade;
//import com.denilton.os.domain.enuns.Status;
//import com.denilton.os.repositories.ClienteRepository;
//import com.denilton.os.repositories.OsRepository;
//import com.denilton.os.repositories.TecnicoRepository;
//import com.denilton.os.services.DBservice;
import com.denilton.os.services.DBservice;

@Configuration
@Profile("test")
public class TesteConfig {

	@Autowired
	private DBservice dbService;

	@Bean
	public void instanciaDB() {
		this.dbService.instanciaDB();
	}

}
