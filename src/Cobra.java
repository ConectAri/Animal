
public class Cobra extends Reptil {
	
	
	

	public String espécie =" Cobra-verde ";
	public int idade = 30;
	
	
	public Cobra(String nome, int idade) {
		super(nome, idade);
		
	}
	
		
		
	
	public String getRaça() {
		return espécie;
	}

	public void setRaça( String espécie) {
		this.espécie = espécie;
	}

	
	
	//método falar
	public void fazBarulho() {
		
		System.out.println(" O  barulho da cobra  é fazer:  SISSSSSSSSSSSSSSSSSSSS!!!!! ");
		
	}
	
		public void  trocarPele() {
			
			System.out.println(" Uma  cobra jovem troca de pele a cada quatro semanas, "
					+ "já uma adulta troca de cinco a oito vezes por ano.");                         
			
		}
		
		
		@Override
		public void alimentar() {
			
			System.out.println(" A cobra é carnívora");
			super.alimentar();
		}
		
		@Override
		public void locomover() {
			
			System.out.println(" A cobra rasteja. ");
			
			
		}
		
		public String getInfo() {
			
			//return " Sou um " + this.raça + " ! " ;
			
			System.out.println(" A" + this.espécie + " está na classe de animais vertebrados ! ");
			System.out.println(" A espécie pode " + getNadar() + " e " + getRastejar()+ ".");
					
			return espécie;
			
		}
		
		
	}


