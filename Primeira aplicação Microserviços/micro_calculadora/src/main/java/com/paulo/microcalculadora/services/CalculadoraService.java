package com.paulo.microcalculadora.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paulo.microcalculadora.model.Calculadora;
import com.paulo.microcalculadora.model.Tabela;

@Service
public class CalculadoraService {
	
	//@Value("http://localhost:8004") ou...
	@Value("${micro_tabela.host}")
	private String microTabela;
	
	@Autowired
	private RestTemplate restTemplate;
	//na calculadora deste projeto passa duas variaveis
	
	public Calculadora getCalculo(long tabelaId, int dias) {
		//crio um hash e nele passo um parametro la para o controller como String
		Map<String, String> urlParametros = new HashMap<>();
		//pegue oa dados  relativos a outra aplicação
		urlParametros.put("id", "" + tabelaId);
//		System.out.println(urlParametros.put("id", ""+tabelaId));
//		System.out.println(tabelaId);
		Tabela tabela = restTemplate.getForObject(microTabela + "/tabela/{id}", Tabela.class, urlParametros);
		return new Calculadora(tabela.getPessoa(), tabela.getPrecoPorDia(), dias);
	}
	//localhost:porta1/tabela
	//localhost:porta2/[passa os parametros]
}
