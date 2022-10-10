
//Não desejo que seja estanciado um animal
public abstract class Animal {

	// atributos

	private String nome;
	private int idade;
	
	
	// Construtor

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public Animal() {

	}

	// método (tem, faz, estar)

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	//Método
	
	public void alimentar() {
		
	}
	
	
	public void locomover() {
		
	}
	
	
	
	
//	// Médoto ///////////////////////////////////////////falta terminar de fazer
//	public void alimentaçãocarnivora(boolean alimentar) {
//		
//	boolean sim = true;
//	
//	if (alimentar == sim) {
//		
//		System.out.println(" Este animal é carnívoro."); 
//	}else {
//		System.out.println(" Vegetariano ");
//	}
		
	}


