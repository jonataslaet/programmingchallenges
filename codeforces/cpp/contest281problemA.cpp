#include <iostream>
#include <cstring>
#include <cstdio>
using namespace std;

int main(int argc, char *argv[])
{
	int i = 0;
	char w[1001];
	cin >> w;
	while(w[i] != '\0')
	{
		if (i == 0) printf("%c", toupper(w[i]));
		else printf("%c", w[i]);
		i++;
	}
	return 0;
}