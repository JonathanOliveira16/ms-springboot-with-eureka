package io.github.jonathan.msavaliadorcredito.infra.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.jonathan.msavaliadorcredito.domain.model.DadosCliente;

@FeignClient(value = "msclientes", path="/clientes")
public interface ClientResourceClient {

	@GetMapping(params="cpf")
	ResponseEntity<DadosCliente> dadosCliente(@RequestParam("cpf") String cpf);
		
	
}
