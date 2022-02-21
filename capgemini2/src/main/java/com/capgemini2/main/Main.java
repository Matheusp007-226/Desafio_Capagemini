package com.capgemini2.main;

import java.util.Scanner;

import com.capgemini2.services.ContextValidacaoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastre uma senha seguindo os seguintes critérios\n");
		System.out.println("A senha deve conter:");
		System.out.println("* No minímo 6 caracteres.");
		System.out.println("* Conter no mínimo 1 digito.");
		System.out.println("* Conter no mínimo 1 letra em minúsculo.");
		System.out.println("* Conter no mínimo 1 letra em maiúsculo.");
		System.out.println("* Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
		System.out.println("");
		
		
		String senha = scanner.nextLine();
		
		ContextValidacaoService.validaRegraSenha(senha);
		
		
		
	}

}
