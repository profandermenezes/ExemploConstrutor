package pacote;

public class Teste {

	public static void main(String[] args) {
		
		// Usando o construtor default
		//Exemplo exemplo1 = new Exemplo();
		
		// Usando o construtor parametrizado
		Exemplo exemplo2 = new Exemplo(111);

		
		//System.out.println("Código do 1: " + exemplo1.getCodigo());
		System.out.println("Código do 2: " + exemplo2.getCodigo());
	}

}
