package br.com.impacta.manutencaoveiculo;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/manutencoes")
public class ManutencaoController {

	@GetMapping("/gettotal")
	public String listarTodos() {
		return "Listar todos";
	}
	@GetMapping("/getum")
	public String listarPorId() {
		return "Listar um";
	}
	@PostMapping("/postar")
	public String postar() {
		return "Postar por id";
	}
	@PutMapping("atualizar")
	public String atualizarPorId() {
		return "atualizar por id";
	}
	@DeleteMapping("deletar")
	public String deletarPorId() {
		return "deletar por id";
	}
	

//	  private final EmployeeRepository repository;

//	  EmployeeController(EmployeeRepository repository) {
//	    this.repository = repository;
//	  }

	// Aggregate root
}