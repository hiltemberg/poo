
public class Gato {
	String name;
	int vidas;
	
	void miar() {
		if(this.vidas>0)
			System.out.println("miau");
		else
			System.out.println(".");
	}
	void fingirDeMorto() {
		this.vidas -= 1;
		
	}
	
	public static void main(String[] args) {
		Gato kiko = new Gato();
		kiko.name = "kiko";
		kiko.vidas = 7;
		
		for(int i = 0; i<10; i++) {
			kiko.fingirDeMorto();
			kiko.miar();
		}
	}
}
