/* Faça um programa que receba a idade de uma pessoa e mostre na 
saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto   */

package br.com.exercicioscondicionais;


import java.util.Scanner;

public class categoriaIdade {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
				
		int idade; 
		
		System.out.println("Digite a sua idade entre 10 à 25: ");
		idade= entrada.nextInt();
		
		switch(idade) {
		
			case 10,11,12,13,14: 
				System.out.println("Categotira Infantil!");
			break;
		
			case 15,16,17: 
				System.out.println("Categotira Juvenil!");
			break;
		
			case 18,19,20,21,22, 23, 24,25: 
				System.out.println("Categotira Adulto!");
			break;	
			
			default: 
				System.out.println("A idade inserida não corresponde as categorias!");	
		}
		
		entrada.close();
	}
}