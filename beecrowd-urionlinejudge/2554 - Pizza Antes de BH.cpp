/*
PROBLEMA:
2554 - Pizza Antes de BH
RESPOSTA:
Accepted
LINGUAGEM:
C++17 (g++ 7.3.0, -std=c++17 -O2 -lm) [+0s]
TEMPO:
0.000s
TAMANHO:
743 Bytes
MEMÓRIA:
-
SUBMISSÃO:
04/06/2022 21:18:45
*/

#include <iostream>
#include <cstdio>
#include <cstring>
using namespace std;

int main(int argc, char *argv[])
{
	int dia, mes, ano, n, p, qtdDisponivel, d, day, month, year, todosOk;
	while(scanf("%d %d", &n, &d) != EOF)
	{
		todosOk = 0;
		for(int i = 0; i < d; i++)
		{
			qtdDisponivel = 0;
			scanf("%d/%d/%d", &dia, &mes, &ano);
			for (int k = 0; k < n; k++)
			{
				scanf("%d", &p);
				qtdDisponivel += p;
				if (qtdDisponivel == n && todosOk == 0)
				{
					day = dia;
					month = mes;
					year = ano;
					todosOk = 1;
				}
			}
		}
		//Todos podem ir
		if (todosOk == 1) printf("%d/%d/%d\n", day, month, year);
		//Ninguém pode ir
		else printf("Pizza antes de FdI\n");


	}
	return 0;
}