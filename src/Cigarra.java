
public class Cigarra extends Inseto {

	public String espécie = "Carineta fasciculata";
	public int idade = 17;

	public Cigarra(String nome, int idade) {
		super(nome, idade);

	}

	// método falar

	// método falar
	public void fazBarulho() {

		System.out.println(" O canto da cigarra é:  Nheeeeeeeeeeeeeeeeeeeeeeeee ");

	}

	public void curiosidade() {

					
		System.out.println(" No Brasil, a ação das cigarras é bastante sentida nas plantações de cultivo do café."); 							                                                                                 
		System.out.println(" O Estado de MG, que é o maior produtor do café do país, a anção das cigarras causa");                                                                                 
		System.out.println(" a descoloração e a queda de forma precoce das folhas das espécies vegetais ");
		System.out.println(" que podem causar a  redução da produção e em casos extremos, a perda total da lavoura"); 
		System.out.println(" caso a praga não seja controlada em tempo hábil. ");
		
		
	}
	
	
	

	@Override
	public void alimentar() {

		System.out.println(" As cigarras se alimentam da seiva das plantas pela raiz e injetam toxinas. ");

	}

	@Override
	public void locomover() {

		System.out.println(" A cigarra voa. ");

	}

	public String getInfo() {

		// return " Sou um " + this.raça + " ! " ;

		System.out.println(" A " + this.espécie + " está na classe de animais invertebrados ! ");
		System.out.println(" A espécie pode " + this.getVoar() + " e sofrer metamorfose.");
		System.out.println(" O tempo de vida da cigarra dura em média de: " + this.idade);

		return espécie;

	}

	public String getEspécie() {
		return espécie;
	}

	public void setEspécie(String espécie) {
		this.espécie = espécie;
	}
}
