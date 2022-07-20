package PolimorfismoCollection;

public class TestePolAnimal {

	public static void main(String[] args) {
		
		PolCachorro animal1 = new PolCachorro();
		PolCavalo animal2 = new PolCavalo();
		PolPreguiça animal3 = new PolPreguiça();
		
		animal1.setNome("Cachorro");
		animal1.setIdade();
		animal1.mostrar();
		animal1.som();
		animal1.correr();
		System.out.println();
		animal2.setNome("Cavalo");
		animal2.setIdade();
		animal2.mostrar();
		animal2.som();
		animal2.parar();
		System.out.println();
		animal3.setNome("Preguiça");
		animal3.setIdade();
		animal3.mostrar();
		animal3.som();
		animal3.subir();

	}

}
