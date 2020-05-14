package com.carlosjube.service.impl;

import com.carlosjube.repository.AlunoRepository;

public class AlunoServiceImpl {

	AlunoRepository alunoRepository = new AlunoRepository();
	
	public String build() {
		System.out.println("AlunoServiceImpl : build");
		String nomeAluno = alunoRepository.findAluno();
		
		return criarMensagem(nomeAluno);
	}
	
	private String criarMensagem(String nome) {		
		String saudacao = "Olá ";

		return saudacao + nome;
	}
}
