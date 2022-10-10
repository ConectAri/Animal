
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teste {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		operacoes();

	}

	@SuppressWarnings("unused")
	public static void operacoes() {

		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat(" dd/MM/yyyy");
		String dataFormatada = formatar.format(data);
		
		System.out.println("                                                ");
		System.out.println("                                                ");
		System.out.println("                               ^ ')             ");
		System.out.println("                             /  )')             ");
		System.out.println("                            ( ( ')              ");
		System.out.println("      A.--.A     . - '' - . ) )')               ");
		System.out.println("    /  ,  ,   \\\\/      \\\\/  /')             ");
		System.out.println("   =\\\\  t   ;=       /      /')               ");
	    System.out.println("      '--,\\ '  . ''|       /')                 ");
		System.out.println("          || |    \\\\\\\\  \\\\')              ");
		System.out.println("         ((,_|    ( (, _ \\ )                   ");
		System.out.println(" -^- ^-^-^-^-^-^-^-^-^-^-^-^-^-                 ");
		System.out.println(" ^-^-^-^-^-^-^-^-^-^-^-^- ^-^-^-^-^-^-^-^-^-^-^-");
		
		System.out.println(" ===========================================================");
		System.out.println(" ================== MUNDO ANIMAL !!!!=======================");
		System.out.println(" ===========================================================");

		System.out.println("==  Realize sua pesquisa, hoje dia: " + dataFormatada + "===");
		
		System.out.println(" ===========================================================");

		System.out.println("    Qual  tipo de animal você  deseja saber informações?     ");
		System.out.println(" ");
		System.out.println(" [  1 - Leão      ] ");
		System.out.println(" [  2 - Cobra     ] ");
		System.out.println(" [  3 - Sabiá     ] ");
		System.out.println(" [  4 - Cigarra   ] ");
		System.out.println(" [  5 - Sair      ] ");
		int tipodeanimal = leia.nextInt();

		switch (tipodeanimal) {
		case 1:
			leao();
			break;
		case 2:
			cobra();
		case 3:
		 	sabia();
 		break;
		case 4:
			cigarra();
			break;
		case 5:
			System.out.println(" Obrigado por conhecer mais um de nossos animais !!!");
			System.exit(0);
		default:
			System.out.println(" Opção inválida!!!!");
		break;
						
		}

	}

	

	// Leão

	private static void leao() {

		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|                                                             |");
		System.out.println("|                <<<<<<<< LEOÃO  >>>>>>>>                     |");
		System.out.println("|                                                             |");

		
		//String produzleite, String dentes, String nome, int idade, String raça
		//" produz leite", " dentes" , " O nome é Simba! ", 10, " Sul-africano"
		//public Leão(String nome, int idade, String produzleite, String dentes)
		//" O nome é Simba ",10," produz leite ", " dentes" 
		
		Leão l = new Leão( " O nome é Simba ", 10);
		l.locomover();
		l.fazBarulho();
		l.viverEmgrupo();
		l.getInfo();
		l.alimentar();
		
				
		System.out.println("|                                                             |");
		System.out.println("|                                                             |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");

		System.out.println(" Quer conhecer mais  animais? ");

		System.out.println(" ");
		System.out.println(" 1 - Conhecer novos animais.");
		System.out.println(" 2 - Sair ");
		System.out.println(" ");
		double escolha = leia.nextDouble();

		if (escolha == 1) {
			operacoes();
		} else {
			System.out.println(" Obrigado por conhecer mais um de nossos animais !!!");
			System.exit(0);// Determina que o programa está saindo com sucesso
		}
	}
	
	  // Cobra
	
	private static void cobra() {
		
		
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|                                                             |");
		System.out.println("|                 ~~~~~~ COBRA ~~~~~~                         |");
		System.out.println("|                                                             |");
		
		Cobra c = new Cobra (" rastejar ", 30);
		
		c.locomover();
		c.fazBarulho();
		c.getInfo();
		c.alimentar();
		c.trocarPele();
				
		System.out.println("|                                                             |");
		System.out.println("|                                                             |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");

		System.out.println(" Quer conhecer mais  animais? ");

		System.out.println(" ");
		System.out.println(" 1 - Conhecer novos animais.");
		System.out.println(" 2 - Sair ");
		System.out.println(" ");
		double escolha = leia.nextDouble();

		if (escolha == 1) {
			operacoes();
		} else {
			System.out.println(" Obrigado por conhecer mais um de nossos animais !!!");
			System.exit(0);// Determina que o programa está saindo com sucesso
		}
		

	}
	
	/////////Sabiá
	
	private static void sabia() {
		
		
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|                                                                                 |");
		System.out.println("|                         (((((((((( SABIÁ ))))))))))))                           |");
		System.out.println("|                                                                                 |");
		
		// " voar ", " Sabiá Laranjeira " 
		Sabiá s = new Sabiá ( true );
		
		s.fazBarulho();
		s.alimentar();
		s.getInfo();
		s.curiosidade();
		s.getInfo();
				
		System.out.println("|                                                                                |");
		System.out.println("|                                                                                |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");

		System.out.println(" Quer conhecer mais  animais? ");

		System.out.println(" ");
		System.out.println(" 1 - Conhecer novos animais.");
		System.out.println(" 2 - Sair ");
		System.out.println(" ");
		double escolha = leia.nextDouble();

		if (escolha == 1) {
			operacoes();
		} else {
			System.out.println(" Obrigado por conhecer mais um de nossos animais !!!");
			System.exit(0);// Determina que o programa está saindo com sucesso
		}

}
	 ///////// CIGARRA
	
	private static void cigarra() {
		
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|                                                                                     |");
		System.out.println("|                         ######## CIGARRA #############                              |");
		System.out.println("|                                                                                     |");
		
		// " voar ", " Sabiá Laranjeira " 
		Cigarra i = new Cigarra("voar", 17 ) ;
	
		i.alimentar();
		i.fazBarulho();
		i.getEspécie();
		i.locomover();
		i.getInfo();
		i.curiosidade();
	
	
				
		System.out.println("|                                                                                     |");
		System.out.println("|                                                                                     |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");

		System.out.println(" Quer conhecer mais  animais? ");

		System.out.println(" ");
		System.out.println(" 1 - Conhecer novos animais.");
		System.out.println(" 2 - Sair ");
		System.out.println(" ");
		double escolha = leia.nextDouble();

		if (escolha == 1) {
			operacoes();
		} else {
			System.out.println(" Obrigado por conhecer mais um de nossos animais !!!");
			System.exit(0);// Determina que o programa está saindo com sucesso
		}
	
		
	}
}
