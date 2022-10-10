
//Características dos mamíferos https://escolakids.uol.com.br/ciencias/mamiferos.htm

public class Mamífero extends Animal {
	
		
	
	
	private String produzleite = " Produz Leite.";
	private String dentes = " Tem dentes.";
	//public String caminhar; //cabra,boi,cachorro,castor,elefante,esquilo,golfinho
	
	
	//Locomoção é um método


	public Mamífero(String nome, int idade) {
		super( nome,  idade);

		
	}



	public String getProduzleite() {
		return produzleite;
	}


	public String getDentes() {
		return dentes;
	}


	

	public void setDentes(String dentes) {
		this.dentes = dentes;
	}

	
	
	
	

}
