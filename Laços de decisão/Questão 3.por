programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva ("Digite sua idade ")
		leia (idade)

		se (idade >= 10 e idade <= 14){
			escreva ("Você é infantil")
		}senao se (idade >= 15 e idade <= 17){
			escreva ("Você é juvenil")
		}senao se (idade >= 18 e idade <= 25){
			escreva ("Você é adulto")
		}senao{
			escreva ("Sua idade não corresponde a idade necessária")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */