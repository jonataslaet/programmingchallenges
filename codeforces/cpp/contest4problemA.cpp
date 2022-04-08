#include <iostream>
using namespace std;

//Problema: saber se W pode ser dividido em duas partes (p1 e p2) tal que p1 é par e p2 é par
int main(int argc, char *argv[])
{
	int w;
	cin >> w;

	if (w % 2 == 0 && w >= 4) cout << "YES\n";
	else cout << "NO\n";

	return 0;
}