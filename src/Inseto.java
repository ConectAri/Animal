


public abstract class Inseto extends Animal {
	
	//cigarra
	
	private String andar;
	private String voar = " voar ";
	
	

	public Inseto(String nome, int idade) {
		super( nome,  idade);

		
	}


	public String getAndar() {
		return andar;
	}


	public void setAndar(String andar) {
		this.andar = andar;
	}


	public String getVoar() {
		return voar;
	}


	public void setVoar(String voar) {
		this.voar = voar;
	}
	
	
	
	
	

}
