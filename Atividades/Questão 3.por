programa
{
	//Questão 3
	
	funcao inicio()
	{
		inteiro Totalseg, hora, min, seg
		escreva ("Quanto tempo vai durar o evento em segundos?")
		leia (Totalseg) //12620

		hora = (Totalseg / (60*60)) //3
		min = (Totalseg % (60*60)) / 60 //1820 / 50 = 30
		seg = ((Totalseg % (60*60)) % 60) //20

		escreva ("O evento vai durar ", hora, " horas, ", min," minutos, e ", seg, " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */