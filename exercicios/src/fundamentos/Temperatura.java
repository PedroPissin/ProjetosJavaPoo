package fundamentos;

public class Temperatura {

	
	public static void main(String[] args) {
		
		// (°F - 32) x 5/9 = °C
	    // F e C variaveis 
		// 32 e 5/9 constantes
		
		final double DIV  = 0.5555555555555556;
		final int num  = 32;
	    int f = 86; 
	    	
	  double c = (f - num) * DIV; 
	    
	   System.out.println(f+"F° Convertido em Celsius fica = "+c+"°"); 
	    
	
	}
	
	
}
