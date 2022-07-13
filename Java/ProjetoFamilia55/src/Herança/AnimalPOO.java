package Herança;

public class AnimalPOO {

	public static void main(String[] args) {
		
		Cachorro a1 = new Cachorro("Hulk", "latido", 5);
		Cavalo a2 = new Cavalo("Beleza", "relincho", 13);
		Preguica a3 = new Preguica("Lili", "som de alta-frequênica emitido pelas narinas", 42);
		
		a1.correrCachorro();
		a1.estadoCachorro();
		a1.pularLinha();
		
		
		a2.pararCavalo();
		a2.estadoCavalo();
		a2.pularLinha();
		
		a3.subirPreguica();
		a3.estadoPreguica();
		a3.pararPreguica();
		a3.estadoPreguica();

	}

}
