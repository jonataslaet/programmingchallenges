#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstring>
#include <map>
using namespace std;

int absoluteDifference(int a, int b) {
    return a > b ? a - b: b - a;
}

int main(int argc, char *argv[])
{
	int q = 0;
    int n, m;
	int ant = 0, destino, casa; 
	map<int, int> mapa;
	
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
	    cin >> casa;
	    mapa[casa] = i;
	}
	for (int i = 0; i < m; i++) {
	    cin >> destino;
	    q += absoluteDifference(mapa[destino], ant);
	    ant = mapa[destino];
	}
	printf("%d\n", q);
	
	
	return 0;
}
