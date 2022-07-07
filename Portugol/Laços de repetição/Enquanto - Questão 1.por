programa
{
	
	funcao inicio()
	{
		inteiro num = 0, total = 0, media, valores = 0

		//escreva ("\nEscreva um número: ")
		//leia (num)

		enquanto(num >= 0){
			escreva ("\nEscreva um número: ")
			leia (num)
			total = total + num
			valores++
			
		}

		escreva ("\nA soma dos números foi de ", total)

		media = total / valores
		escreva ("\nA média é ", media)
		escreva ("\nO total de números inseridos foi de ", valores)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 6, 37, 7}-{num, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */