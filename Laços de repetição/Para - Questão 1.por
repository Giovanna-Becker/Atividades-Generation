programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real filhos, totalFilhos = 0, salario, totalSalarios = 0, mediaSalarios, maiorSalario = 0, mediaFilhos, hab = 0, salario100 = 0, perHab

		para (hab = 1; hab <= 20; hab++){
			escreva ("\nQuanto você ganha por mês? ")
			leia (salario)

			se(salario <= 100){
				salario100++
			}senao se (salario > maiorSalario){
				maiorSalario = salario
			}

			totalSalarios = totalSalarios + salario

			escreva ("Quantos filhos você tem?")
			leia (filhos)
			totalFilhos = totalFilhos + filhos	
		}

		mediaSalarios = totalSalarios / 20
		escreva ("\nA média de salários é R$", mediaSalarios)

		mediaFilhos = totalFilhos / 20
		escreva ("\nA média de filhos é ", mediaFilhos)

		escreva ("\nO maior salário é de R$", maiorSalario)

		perHab = (salario100 * 100) / 20
		escreva ("\nO percentual de pessoas que recebem até R$100,00 por mês é de ", perHab, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */