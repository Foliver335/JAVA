/*Exercícios
 

1 - Escreva um programa efetuar o cálculo do salário bruto e do salário

líquido de um empregado. Os dados fornecidos são:

 

- O valor do salário hora

- O número de horas trabalhadas no mês

- O percentual de desconto do INSS */



package Salarios;

import static java.lang.System.out;

import java.util.Scanner;

public class calculadora {
	//atributo de classe
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Scanner inputNumScanner = new Scanner(System.in);
		
		float VaLH= 0;
		int HR = 0;
		int INSS = 0;
		int INSS2 = 0;
		float Sal_Brut= 0;
		float Sal_Liq= 0;
		float Cal_Sal= 0;

		System.out.print("Digite O valor do salário/ hora:R$");
		
		VaLH = inputNumScanner.nextFloat();
		
		System.out.print("Digite O número de horas trabalhadas no mês:");
		HR= inputNumScanner.nextInt();
		
		System.out.print("Digite O percentual de desconto do INSS :");
		INSS = inputNumScanner.nextInt();
		
		INSS2 = (INSS* 100/ 100);
       
       
       System.out.println("A porcentagem é = " + INSS2 + " %");
		
		Sal_Brut = VaLH*HR;
		Cal_Sal = (Sal_Brut)/(INSS);
		Sal_Liq = (Sal_Brut)-(Sal_Brut)/(INSS);
		
		System.out.printf("Seu salário bruto é:%f\n", Sal_Brut );

		out.printf("Seu salário liquido é: %f\n", Sal_Liq );


	
	
	
	}

}
