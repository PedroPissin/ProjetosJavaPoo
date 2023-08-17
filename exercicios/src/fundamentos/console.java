package fundamentos;

import java.util.Scanner;

public class console {

	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia");
		
		System.out.println("\nBoa Tarde!!!");
	
	    System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
	    System.out.printf("\nSalario: R$%.1f%n", 1234.5678);
	
	    Scanner entrada = new Scanner(System.in); 
	    System.out.print("Digite o seu nome: ");
	    String nome = entrada.nextLine(); 
	    
	
	    System.out.print("Digite o seu sobrenome: ");
	    String sobrenome = entrada.nextLine(); 
	   
	 
	    System.out.print("Digite a sua idade: ");
	    int idade = entrada.nextInt(); 
	    
	    System.out.printf("Eu me chamo %s %s e tenho %d anos de idade.", 
	    		nome, sobrenome, idade);
	
	entrada.close();
	
	}
	
}
