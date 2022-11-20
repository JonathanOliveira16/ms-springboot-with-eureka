package io.github.jonathan.mscartoes.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DadosSolicitacaoEmissaoCartao {
	private Long idCartao;
	private String cpf;
	private String endereço;
	private BigDecimal limiteLiberado;
}
