programa
{
	
	funcao inicio()
	{
		inteiro valor[3][3], diagonal, somaValores = 0, l, c

		para(l = 0; l < 3; l++){

			escreva ("\n")
			para(c = 0; c < 3; c++){
				escreva ("Entre com um número: ")
				leia (valor[l][c])

				somaValores += valor[l][c]
			}
		}

		escreva ("\nA soma dos valores é de ", somaValores)
		diagonal = valor[0][0] + valor[1][1] + valor[2][2]
		escreva ("\nA soma dos valores da diagonal principal é ", diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 6, 10, 5}-{diagonal, 6, 23, 8}-{somaValores, 6, 33, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */