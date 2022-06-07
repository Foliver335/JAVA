/*Exercícios
 

1 - Escreva um programa efetuar o cálculo do salário bruto e do salário

líquido de um empregado. Os dados fornecidos são:

 

- O valor do salário hora

- O número de horas trabalhadas no mês

- O percentual de desconto do valorINSS */



package Salarios;

import static java.lang.System.out;

import java.util.Scanner;

public class calculadora {
	//atributo de classe
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Scanner inputNumScanner = new Scanner(System.in);
		
		float valorHora= 0f;
		int horaTrabalhada = 0;
		int valorINSS = 0;
		int valorvalorINSS2 = 0;
		float salarioBruto=0f;
		float salarioLiquido= 0f;
		float calculoSalarial= 0f;

		System.out.print("Digite O valor do salário/ hora:R$");
		
		valorHora = inputNumScanner.nextFloat();
		
		System.out.print("Digite O número de horas trabalhadas no mês:");
		horaTrabalhada= inputNumScanner.nextInt();
		
		System.out.print("Digite O percentual de desconto do valorINSS :");
		valorINSS = inputNumScanner.nextInt();
		
		valorvalorINSS2 = (valorINSS* 100/ 100);
       
       
       System.out.println("A porcentagem é = " + valorvalorINSS2 + " %");
		
		salarioBruto = valorHora*horaTrabalhada;
		calculoSalarial = (salarioBruto)/(valorINSS);
		salarioLiquido = (salarioBruto)-(salarioBruto)/(valorINSS);
		
		System.out.printf("Seu salário bruto é:%f\n", salarioBruto );

		out.printf("Seu salário liquido é: %f\n", salarioLiquido );


	
	
	
	}

}
