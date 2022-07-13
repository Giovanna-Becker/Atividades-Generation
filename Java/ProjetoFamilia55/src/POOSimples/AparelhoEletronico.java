package POOSimples;

public class AparelhoEletronico {
	
	private String memoria, cor;
	private int statusMemoria;
	private double tamanho;
	private boolean tela;

	public void ligar() {
		this.tela = true;
	}
	
	public void desligar() {
		this.tela = false;
	}
	
	public void statusTela() {
		if(this.tela == true)
			System.out.println("Ligada");
		else
			System.out.println("Desligada");
	}
	
	public AparelhoEletronico(String c, String m, double t) {
		this.cor = c;
		this.memoria = m;
		this.tamanho = t;
	}

	public String getMemoria() {
		return memoria;
	}

	public String getCor() {
		return cor;
	}

	public double getTamanho() {
		return tamanho;
	}
	
	public boolean isTela() {
		return tela;
	}
	
	public int getStatusMemoria() {
		return statusMemoria;
	}

	public void setStatusMemoria(int statusMemoria) {
		this.statusMemoria = statusMemoria;
	}
	
	public void estado() {
		System.out.print("Status da tela: ");
		statusTela();
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Memória: " + this.memoria);
		System.out.println("Status da memória: " + this.statusMemoria + "%");
	}
	
}
