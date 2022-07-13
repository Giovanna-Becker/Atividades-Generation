package POO;

import java.util.*;

public class Cliente {

	//Cliente Stream -> Atributos
	
	private String nome, plano, banco, email;
	private boolean pagamento;
	
	//Métodos
	
	Scanner leia = new Scanner(System.in);
	
	public void contaPaga() {
		this.pagamento = true;
	}
	
	public void esqueciPagamento() {
		this.pagamento = false;
	}
	
	public void statusConta() {
		if(this.pagamento == false)
			System.out.println("Conta bloqueada. Realize se pagamento.");
		else
			System.out.println("Prepare o refri e a pipoca...");
	}
	
	public void statusPagamento() {
		if(this.pagamento == false)
			System.out.println("Pagamento atrasado");
		else
			System.out.println("Pagamento em dia");
	}
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlano() {
		return plano;
	}
	
	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}

	public boolean isPagamento() {
		return pagamento;
	} 
	
	public void configuraçõesConta() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Banco: " + this.banco);
		System.out.println("Plano: " + this.plano);
		statusPagamento();
		statusConta();
	}
}
