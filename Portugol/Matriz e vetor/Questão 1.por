programa
{
	
	funcao inicio()
	{
		inteiro nota[5], maiorNota = 0, x

		para(x = 0; x < 5; x++){
			escreva ("Escreva a pontuação: ")
			leia (nota[x])

			se(nota[x] > maiorNota){
				maiorNota = nota[x]
			}
		}

		para(x = 0; x < 5; x++){
			escreva ("\nNota ", x + 1, ": ", nota[x])
		}

		escreva ("\nA maior pontuação foi de ", maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */