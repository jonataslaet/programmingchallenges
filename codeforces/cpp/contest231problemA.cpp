#include <iostream>
#include <cstdio>
using namespace std;

int main(int argc, char *argv[])
{
	int n, a, b, c, q = 0;
	scanf("%d", &n);
	for(int i = 0; i < n; i++)
	{
		scanf("%d %d %d", &a, &b, &c);
		if (a + b + c > 1)q++;
	}
	printf("%d\n", q);
	return 0;
}