package PolimorfismoCollection;

public class PolPreguiça extends PolAnimal{

	private boolean subir;
	
	@Override
	public void som() {
		System.out.println("Som: " + nome + " emite um som de alta-frequênica emitido pelas narinas");
	}
	
	void subir() {
		System.out.println(nome + " está subindo em uma árvore");
		subir = true;
	}
	
	void parar() {
		if(subir == true) {
			System.out.println(nome + " parou de subir na árvore");
			subir = false;
		} else {
			System.out.println(nome + " está dormindo");
		}
	}
	
	void mostrar() {
		System.out.println();
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
	}
}
