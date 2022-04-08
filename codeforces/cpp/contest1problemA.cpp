#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char *argv[])
{
	long long int n, m, a, resposta;
	double x, y, z;
	cin >> n >> m >> a;
	x = (double)n;
	y = (double)m;
	z = (double)a;
	resposta = (ceil(x/z)) * (ceil(y/z));
	// [tetoDe(n/a)] * [tetoDe(m/a)]
	cout << resposta << endl;
	return 0;
}