package br.fai.projeto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Main app = new Main();
			app.start();

	}


private void start() {
	System.out.println("Digite um valor: ");
	
	Scanner scanner = new Scanner(System.in);
	double valor = scanner.nextDouble();
	
	int valorComCast = (int) valor; //cast
	
	System.out.println("Valor com casas: " + valor + " | valor inteiro: " + valorComCast);
	
	
	
}
}
