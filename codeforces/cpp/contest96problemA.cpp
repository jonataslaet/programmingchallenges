#include <iostream>
#include <vector>
#include <cstdio>
#include <cstring>
using namespace std;

int main(int argc, char *argv[])
{
	char players[101];
	int t, q1 = 0, q0 = 0, q = 0;
	scanf("%s", players);
	t = strlen(players);
	for(int i = 0; i < t; i++)
	{
		if (players[i] == '1')
		{
			q1++;
			q0 = 0;
		}
		else
		{
			q0++;
			q1 = 0;
		}
		if (q1 > 6 || q0 > 6) q = 1;
	}
	if (q == 0) printf("NO\n");
	else printf("YES\n");

	return 0;
}