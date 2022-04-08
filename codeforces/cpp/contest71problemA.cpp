#include <iostream>
#include <stdio.h>
using namespace std;

int main(int argc, char *argv[])
{
	int n, t, qtdLetrasMeio;
	string palavra;
	cin >> n;
	qtdLetrasMeio = 0;
	getchar();
	for(int i = 0; i < n; i++)
	{
		cin >> palavra;
		t = palavra.size();
		if (t <= 10) cout << palavra << endl;
		else
		{
			qtdLetrasMeio = t - 2;
			cout << palavra[0] << qtdLetrasMeio << palavra[t-1] << endl;
		}
		palavra.clear();
	}
	return 0;
}