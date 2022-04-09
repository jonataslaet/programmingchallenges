#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	int matriz[101][101];
	int n, i, j, aluno[101], winner;
	for (;;)
	{
		scanf("%d", &n);
		if (n == 0) break;
		else
		{
			memset (aluno, 0, n * sizeof(int));
			winner = 0;
			for (i = 0; i < n; i ++)
			{
				for (j = 0; j < n; j++)
				{
					scanf("%d", &matriz[i][j]);
					aluno[j] = aluno[j] + matriz[i][j];
					if (aluno[j] > winner) winner = aluno[j];
				}
			}
			printf("%d\n", winner);
		}
	}

	return 0;
}