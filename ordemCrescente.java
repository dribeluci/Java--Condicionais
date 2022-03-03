/* Exercício proposto:

Faça um programa que leia três números e coloque 
eles em ordem crescente. */

package br.com.exercicioscondicionais;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		

		Scanner leia= new Scanner (System.in); // system- valor de inicio (in)
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o 1º numero: ");
		numero1= leia.nextInt();
		System.out.println("Digite o 2º numero: ");
		numero2= leia.nextInt();
		System.out.println("Digite o 3º numero: ");
		numero3= leia.nextInt();
		
			if (numero1 < numero2) {
				if (numero2 < numero3) {
					System.out.println("A ordem é: "+ numero1 + numero2 + numero3);
				}  
				else if (numero1 < numero3) {
					System.out.println("A ordem é: "+ numero1 + numero3 + numero2);
				}
				else {
				System.out.println(" A ordem é: " + numero3 + numero1 + numero2);
				}
			} 
		
			else if(numero2 < numero3){	
				if(numero1 < numero3) {
					System.out.println(" A ordem é: " + numero2 + numero1 + numero3);
				}
				else {
					System.out.println(" A ordem é: " + numero2 + numero3 + numero1);
				}
			}
		
			else {
				System.out.println(" A ordem é: " + numero3 + numero2 + numero1);
			}
			
		leia.close();
		
	}
}