
//tudo que tiver em mamífero vai estender em Vaca
public class Leão extends Mamífero {

	public String raça = " Leão-sul-africano";
	// private String nome = " O nome do Leão é Simba! ";
	public int idade = 10;

	// Atributo

//		public Leão(String nome, int idade, String produzleite, String dentes) {
//		super(nome, idade, produzleite, dentes);
//		// TODO Auto-generated constructor stub
//	}

	public Leão(String nome, int idade) {
		super(nome, idade);

	}

	// Construtor

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	// método de comportamento do animal:

	public void viverEmgrupo() {

		System.out.println(" Entre os felinos, os leões são os únicos que vivem em grupo. ");

	}

	// método falar
	public void fazBarulho() {

		System.out.println(" O barulho do leão é fazer : Uoullllllllllllllllllllllll ");

	}



	@Override
	public void locomover() {
		
		System.out.println(" O  leão  caminha e tem 4 patas. ");
		
		super.locomover();
	}
	
	
	
	
	@Override
	public void alimentar() {
		System.out.println(" Este animal é carnívoro. ");
		super.alimentar();
	}
	

	public String getInfo() {

		// return " Sou um " + this.raça + " ! " ;

		System.out.println(" O" + this.raça + ", está na classe de animais vertebrados ! ");
		System.out.println(" A espécie de leões " + getProduzleite() + "e" + " tem " + getDentes());
		System.out.println(getNome());
		System.out.println(" A idade do Leão é: " + this.idade);
		return raça;

	}
}
