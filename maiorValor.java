/*  Exerc�cio proposto: 
Fa�a um programa que leia tr�s inteiros e aponte
o maior valor. */

package br.com.exercicioscondicionais;

import java.util.Scanner;

public class maiorValor {
	

	public static void main(String[] args) {
		

		Scanner leia= new Scanner (System.in); // system- valor de inicio (in)
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o 1� numero: ");
		numero1= leia.nextInt();
		System.out.println("Digite o 2� numero: ");
		numero2= leia.nextInt();
		System.out.println("Digite o 3� numero: ");
		numero3= leia.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(" \n\n O maior n�mero �: " + numero1);
		}	
			else if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("\n\n O maior n�mero �: " + numero2);
			}
				else if(numero3> numero1 && numero3 >numero1) {
					System.out.println("\n\n O maior n�mero �:   " + numero2);
				}
					else if( numero1 == numero2 && numero1 == numero3) {
						System.out.println("\n\n Os n�meros s�o iguais!");
					}
		
		leia.close();
	}
}