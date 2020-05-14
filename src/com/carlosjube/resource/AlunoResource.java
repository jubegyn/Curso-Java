package com.carlosjube.resource;

import com.carlosjube.service.impl.AlunoServiceImpl;

public class AlunoResource {

	public void print() {
		AlunoServiceImpl alunoService = new AlunoServiceImpl();

		System.out.println("AlunoResource : print");
		String saldacaoAluno = alunoService.build();
		
		System.out.println(saldacaoAluno);
		System.out.println("Finalizado com Sucesso!");
	}

}
