package com.denilton.os.services;

import java.util.Arrays; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denilton.os.domain.Cliente;
import com.denilton.os.domain.OS;
import com.denilton.os.domain.Tecnico;
import com.denilton.os.domain.enuns.Prioridade;
import com.denilton.os.domain.enuns.Status;
import com.denilton.os.repositories.ClienteRepository;
import com.denilton.os.repositories.OsRepository;
import com.denilton.os.repositories.TecnicoRepository;

@Service
public class DBservice {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OsRepository osRepository; 

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Valdir Cesar", "281.530.970-08", "(11) 95801-2234");
		Cliente c1 = new Cliente(null, "Betina Campos", "311.439.820-02", "(11) 92581-0155");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste crate os", Status.ANDAMENTO, t1, c1);

		//t1.getList().add(os1);
		//c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}
