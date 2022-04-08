#include <iostream>
#include <cstdio>
using namespace std;

int main(int argc, char *argv[])
{
	int n, m, x;
	scanf("%d %d", &n, &m);
	x = n * m;
	if (x % 2 == 0) printf("%d\n", x/2);
	else printf("%d\n", (x-1)/2);
	return 0;
}