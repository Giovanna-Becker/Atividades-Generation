programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro num, par, impar, raiz, potencia

		escreva ("Entre com um número ")
		leia (num)

		se (num % 2 == 0){
			par = num
			raiz = mat.raiz(num, 2)
			escreva ("\nA raiz quadrada de ", num, " é ", raiz)
		}senao{
			impar = num
			potencia = mat.potencia(num, 2)
			escreva ("\n", num, " elevado ao quadrado é ", potencia)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */