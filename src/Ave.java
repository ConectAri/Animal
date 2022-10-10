
public abstract class Ave extends Animal {

	// private String passaro;

	private boolean voar;// gaivota, tucano
	
	
	public Ave(String nome, int idade) {
		super( nome,  idade);

		
	}

	public Ave(boolean voar) {
		super();
		this.voar = voar;
	}

	public boolean getVoar() {
		return voar;
	}

}
