package LaçoRepeticao;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		int num, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++) {
			System.out.println("Entre com um número ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Par: " + par);
		System.out.println("Ímpar: " + impar);

	}

}
