/* Exerc�cio proposto:
Fa�a um programa em que permita a entrada de um n�mero qualquer
e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado*/


package br.com.exercicioscondicionais;

import java.util.Scanner;

	public class parImpar {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
				
		int numero; 
		
		System.out.println("Digite um n�mero: ");
		numero= entrada.nextInt();

		
		if (numero % 2 == 0) { 
			 System.out.println(" O n�mero " + numero + " � par!\nO resultado da sua Raiz quadrada �:  " +  Math.sqrt(numero));
		}
		
		else {
			System.out.println("O n�mero " + numero +  " � impar! \nO resultado da sua pot�ncia �: " + Math.pow(numero,2));
		}
		
		entrada.close();
	}
}