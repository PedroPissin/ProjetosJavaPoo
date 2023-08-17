package fundamentos;

import java.util.Scanner;


public class If {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//nao usar ; em estruturas de controle (tem exeção)
		System.out.print("Informe a média: "); 
		double media = entrada.nextDouble(); 
		if(media >= 7.0)
		System.out.println("Aprovado!");
		else 
			System.out.println("Reprovado!");
		
		entrada.close();
	}
	
	
}
