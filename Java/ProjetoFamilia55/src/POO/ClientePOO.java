package POO;

public class ClientePOO {

	public static void main(String[] args) {
		Cliente user1 = new Cliente();
		Cliente user2 = new Cliente();
		
		user1.setNome("Cristal");
		user1.setEmail("cristal1989@gmail.com");
		user1.setBanco("Santander");
		user1.setPlano("Basic");
		user1.contaPaga();
		
		user1.configuraçõesConta();
		
		System.out.println("");
		
		user2.setNome("Ana Beatriz");
		user2.setEmail("aninhaa@gmail.com");
		user2.setBanco("Itaú");
		user2.setPlano("Premium");
		user2.esqueciPagamento();
		
		user2.configuraçõesConta();
		
	}

}
