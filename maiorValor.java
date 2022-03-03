/*  Exercício proposto: 
Faça um programa que leia três inteiros e aponte
o maior valor. */

package br.com.exercicioscondicionais;

import java.util.Scanner;

public class maiorValor {
	

	public static void main(String[] args) {
		

		Scanner leia= new Scanner (System.in); // system- valor de inicio (in)
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o 1º numero: ");
		numero1= leia.nextInt();
		System.out.println("Digite o 2º numero: ");
		numero2= leia.nextInt();
		System.out.println("Digite o 3º numero: ");
		numero3= leia.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(" \n\n O maior número é: " + numero1);
		}	
			else if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("\n\n O maior número é: " + numero2);
			}
				else if(numero3> numero1 && numero3 >numero1) {
					System.out.println("\n\n O maior número é:   " + numero2);
				}
					else if( numero1 == numero2 && numero1 == numero3) {
						System.out.println("\n\n Os números são iguais!");
					}
		
		leia.close();
	}
}