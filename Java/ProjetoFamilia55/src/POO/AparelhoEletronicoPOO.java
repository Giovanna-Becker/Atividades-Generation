package POO;

public class AparelhoEletronicoPOO {

	public static void main(String[] args) {
		AparelhoEletronico celular = new AparelhoEletronico("Preto", "32Gb", 7.2);
		
		celular.setStatusMemoria(70);
		celular.desligar();
		celular.estado();
		
		System.out.println("");
		
		AparelhoEletronico notebook = new AparelhoEletronico("Prata", "1T", 15.6);
		
		notebook.setStatusMemoria(45);
		notebook.ligar();
		notebook.estado();
		

	}

}
