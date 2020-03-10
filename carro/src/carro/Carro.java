
import java.util.Scanner;

public class Carro {
	int nPessoas = 0;
	int maxPessoas = 5;
	
	
	
	void embarcar(int qtd) {
		if (qtd<0);
			System.out.println("N�o pode embarcar n�mero negativo") ;
			return;
		
			
		if (qtd + Carro.nPessoas > Carro.maxPessoas) ;
			System.out.println("Carro cheio");
			return;

		this.nPessoas += qtd;
			System.out.println("Pode entrar");
	    }
		
	void desembarcar(int qtd) {
		if (qtd<0);
			return;
				System.out.println("N�o pode desembarcar n�mero negativo") ;
	
					
		if(this.nPessoas < qtd) {
			System.out.println("S� tem" + this.nPessoas + "no carro") ;
		}
			this.nPessoas -= qtd;
		
	}
	void show() {
		System.out.println("Carro: nPessoas = " + this.nPessoas);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("show")) {
				carro.show();
			}else if(ui[0].equals("embarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.embarcar(qtd);
			}else if(ui[0].equals("desembarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.desembarcar(qtd);
			}else {
				System.out.println("Comando invalido");
			}
		}
//		System.out.print("[ ");
//		for(int i = 0; i < ui.length; i++)
//			System.out.print(ui[i] + ", ");
//		System.out.println("]");
		
		
//		System.out.println("Digite seu nome e seu peso");
//		String nome = scanner.next();
//		float peso = scanner.nextFloat();
//		System.out.println("Nome: " + nome + " Peso: " + peso);
		
		scanner.close();
	}

}

