package Herança;

public class Preguica extends Animal{

	private Boolean subindo;
	
	public void estadoPreguica() {
		if(this.subindo == true) {
			System.out.println(this.nome + " está subindo uma árvore...");
		}else {
			System.out.println(this.nome + " está dormindo em uma árvore.");
		}
	}
	
	public void subirPreguica() {
		this.subindo = true;
	}
	
	public void pararPreguica() {
		this.subindo = false;
	}
	
	public Preguica(String n, String s, int i) {
		this.nome = n;
		this.som = s;
		this.idade = i;
	}
}
