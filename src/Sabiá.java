
public class Sabiá extends Ave {

	public String espécie = " Sabiá Laranjeira ";
	public int idade = 2;

	public Sabiá(boolean voar) {
		super(voar);
	}

	public Sabiá(String nome, int idade) {
		super(nome, idade);

	}

	// método falar
	public void fazBarulho() {

		System.out.println(" O sabiá canta : siusiusiusiusiusiusiu ");

	}

	// método falar

	public void curiosidade() {

		System.out.println(" O sabiá-laranjeira tem fama de ser um pássaro fiel, quando finalmente ");
		System.out.println(" encontra sua companheira acaba seguindo junto com ela a viver com o bando");
		System.out.println(" e inclusive deixa os filhotes para trás para seguir junto da amada.");

	}

	@Override
	public void alimentar() {

		System.out.println(" O sabiá-laranjeira é uma ave com hábitos alimentares frugívoros e insetívoros ");

		super.alimentar();
	}

	@Override
	public void locomover() {

		System.out.println(" O sabiá gosta de voar!!!");
		super.locomover();
	}

	public String getInfo() {

		// return " Sou um " + this.raça + " ! " ;

		System.out.println(" A" + this.espécie + " está na classe de animais vertebrados ! ");
		System.out.println(" Os anos de vida do sabiá é: " + this.idade);
		return espécie;

	}

}
