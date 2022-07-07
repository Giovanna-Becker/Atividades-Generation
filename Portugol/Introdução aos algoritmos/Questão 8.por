programa
{
	
	//Questão 8
	
	funcao inicio()
	{
		inteiro fabrica, distribuidor, impostos, CustoFinal
		escreva("Qual é o custo de fábrica do carro?")
		leia (fabrica)

		distribuidor = (fabrica * 0.28)
		impostos = (fabrica * 0.45)
		CustoFinal = (fabrica + distribuidor + impostos)
		escreva ("O custo para o consumidor é de R$", CustoFinal, ",00")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */