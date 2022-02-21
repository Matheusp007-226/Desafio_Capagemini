package com.capgemini1.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro para 'n' que será a base e altura da escada:");
		int n = scanner.nextInt();
		
		int numeroAsterisco = 0;
		int numeroEspaco = 0;
		
		for(int i = 0; i < n; i++ ) {
			System.out.println("");
			numeroAsterisco = i + 1;
			numeroEspaco = n - numeroAsterisco;
			for(int j = 0; j < n; j++) {
				
				if(numeroEspaco != 0) {
					System.out.print(" ");
					numeroEspaco--;
				}else {
					System.out.print("*");
				}
				
				
			}
		}

	}

}
