programa
{
	
	funcao inicio()
	{
		inteiro num[3], num1 = 0, num2 = 0, num3 = 0, x // x0 = 5, x1 = 3; x2 = 9

		para (x = 0;x < 3; x++){
			escreva ("Entre com um número ")
			leia (num[x])
		}
		
		se (num[0] < num[1] e num[0] < num[2]){
			num1 = num[0]
		}senao se (num[0] < num[1] ou num[0] < num[2]){
			num2 = num[0]
		}senao{
			num3 = num[0]
		}

		se (num[1] < num[0] e num[1] < num[2]){
			num1 = num[1]
		}senao se (num[1] < num[0] ou num[1] < num[2]){
			num2 = num[1]
		}senao{
			num3 = num[1]
		}

		se (num[2] < num[1] e num[2] < num[0]){
			num1 = num[2]
		}senao se (num[2] < num[1] ou num[2] < num[0]){
			num2 = num[2]
		}senao{
			num3 = num[2]
		}

		escreva ("\n\n Os números foram ", num1, ", ", num2, ", ", num3)
			
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 6, 10, 3}-{num1, 6, 18, 4}-{num2, 6, 28, 4}-{num3, 6, 38, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */