package io.github.jonathan.mscartoes.application;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.jonathan.mscartoes.domain.ClienteCartao;
import io.github.jonathan.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {
		
	private final ClienteCartaoRepository repository;
	
	public List<ClienteCartao> listCartoesByCpf(String cpf){
		return repository.findByCpf(cpf);
	}
}
