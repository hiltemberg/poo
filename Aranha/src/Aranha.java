

import java.util.Scanner;

public class Aranha {
	String name;
	int patas;
	int teias;
	int vida;
	
	void arrancarPataDaAranha() {
		this.patas -=1 ;
		System.out.println("uma pata da aranha foi arrancada");
		if(this.patas == 0 ) {
			this.vida -= 1 ;
			System.out.println("a aranha morreu por ficar sem patas");
		}
	}
			
	void tecerTeia() {
		this.teias +=1;
		System.out.println("O aranha acaba de tecer uma teia");
		
	}
	
	void capturarInseto() {
		System.out.println("a aranha capturou um inseto!");
	}
	
	void comerInseto() {
		System.out.println("a aranha comeu um inseto!");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aranha aranha = new Aranha();
		aranha.name = "dona 8 patas";
		aranha.vida = 1;
		aranha.teias = 0;
		aranha.patas =8;
		
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("teça")) {
				aranha.tecerTeia();
			}else if(ui[0].equals("arrancar")) {
				aranha.arrancarPataDaAranha();
			}else if(ui[0].equals("capture")) {
				aranha.capturarInseto();	
			}else if(ui[0].equals("coma")) {
				aranha.comerInseto();
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();

	}
}
				
				
			

	