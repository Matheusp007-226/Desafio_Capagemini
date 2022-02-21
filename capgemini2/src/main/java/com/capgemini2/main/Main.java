package com.capgemini2.main;

import java.util.Scanner;

import com.capgemini2.services.ContextValidacaoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastre uma senha seguindo os seguintes crit�rios\n");
		System.out.println("A senha deve conter:");
		System.out.println("* No min�mo 6 caracteres.");
		System.out.println("* Conter no m�nimo 1 digito.");
		System.out.println("* Conter no m�nimo 1 letra em min�sculo.");
		System.out.println("* Conter no m�nimo 1 letra em mai�sculo.");
		System.out.println("* Conter no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
		System.out.println("");
		
		
		String senha = scanner.nextLine();
		
		ContextValidacaoService.validaRegraSenha(senha);
		
		
		
	}

}
