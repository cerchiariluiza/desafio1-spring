package br.com.impacta.manutencaoveiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManutencaoController {

	@GetMapping("/manutencoes")
	public List<ManutencaoModel> buscarTodos() {
		List<ManutencaoModel> lista = new ArrayList<ManutencaoModel>();
		ManutencaoModel model = new ManutencaoModel();
		model.setNome("Luiza");
		model.setValor(3);
		model.setDia(new Date());
		lista.add(model);
		lista.add(model);
		
		return lista;
	}
	
	@GetMapping("/manutencoes/{id}")
	public ManutencaoModel buscarUm(@PathVariable Long id) {
		System.out.println(">>>>" + id);
		ManutencaoModel model = new ManutencaoModel();
		model.setNome("Luiza");
		model.setValor(2.5);
		model.setDia(new Date());
		return model ;
	}
	
	@PostMapping("/manutencoes")
	public ManutencaoModel criar(@RequestBody ManutencaoModel model) {
		return model;
	}
	
	@PutMapping("/manutencoes/{id}")
	public ManutencaoModel atualizar(@PathVariable Long id, @RequestBody ManutencaoModel model) {
		return model;
	}
	
	@DeleteMapping("/manutencoes/{id}")
	public String remover(@PathVariable Long id) {
		System.out.println(">>>>" + id);
		return "remover";
	}
	
	//pesadelo
	
}