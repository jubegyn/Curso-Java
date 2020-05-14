package com.carlosjube.main;

import com.carlosjube.resource.AlunoResource;

public class Principal {

	public static void main(String[] args) {
		AlunoResource alunoResource = new AlunoResource();
		
		System.out.println("Principal : main");
		alunoResource.print();
	}

}
