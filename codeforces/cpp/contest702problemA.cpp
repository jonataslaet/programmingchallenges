#include <iostream>
#include <vector>
#include <cstdio>
using namespace std;

int main(int argc, char *argv[])
{
	int n, a, b, qMaior, q;
	scanf("%d", &n);
	scanf("%d", &a);
	q = 1;
	qMaior = 1;
	for(int i = 1; i < n; i++)
	{
		scanf("%d", &b);
		//Se o atual for maior que o anterior
		if (b > a)
		{
			q++;
			if (q > qMaior)
			{
				qMaior = q;
			}
		}
		//Se não, se q é maior
		else q = 1;
		a = b;
	}
	printf("%d\n", qMaior);

	return 0;
}