package classes;

public class DataTeste {

	
	
	public static void main(String[] args) {
		
		
		Data data1 = new Data();
		data1.dia = 17;
		data1.mes = 10;
		data1.ano = 2002;
		
		Data data2 = new Data();
		data2.dia = 23;
		data2.mes = 05;
		data2.ano = 2002;
		
		
		System.out.println("A Primeira data: " +data1.dia+"/" +data1.mes+"/"+data1.ano);
		System.out.println("A Segunda data: " +data2.dia+"/" +data2.mes+"/"+data2.ano);
		
		
	}
	
	
	
}
