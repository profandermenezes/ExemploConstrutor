package pacote;

/*
 * Temos 4 situações possíveis:
 * 
 * 1 - Construtor está implícito -> default
 * 2 - Construtor default explícito -> default
 * 3 - Construtor default e parametrizado -> escolha do usuário
 * 4 - Apenas o construtor parametrizado -> obrigatório o seu uso
 */

public class Exemplo {
	
	// Atributos
	private int tamanho;
	private int codigo;
	private String nome;
	
	/*
	 *  Construtor Default
	 *  - publico
	 *  - tem o mesmo nome da classe
	 *  - e não tem parâmetros
	 *  - pode, ou não, estar explícito
	 */
	public Exemplo() {
		tamanho = 10;
		codigo = 1;
		nome = "Meu Exemplo";
	}
	
	/*
	 * Construtor Parametrizado
	 * 
	 */
	public Exemplo(int codigo) {
		this.codigo = codigo;
	}
	
	public Exemplo(int codigo, String nome) {
		
	}
	
	// Métodos de acesso
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
