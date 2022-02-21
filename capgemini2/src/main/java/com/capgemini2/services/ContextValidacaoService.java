package com.capgemini2.services;

public class ContextValidacaoService {
	
	public static void validaRegraSenha(String senha) {
		
			boolean seguro = senha.matches("[.*\\d+.*[a-z]+.*[A-Z]+.*[!@#$%^&*()-+]]{6,}");
		
			if(seguro) {
				System.out.println("Senha segura salvo com sucesso!");
			}else {
				System.out.println("A senha não respeita a politica de senha");
				
				if(senha.length() < 6) {
					int numeroFalta = 6 - senha.length();
					
					System.out.println("Faltam "+numeroFalta+ "caracteres");
				}
			}
	}

}
