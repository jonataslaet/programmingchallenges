#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main(int argc, char *argv[])
{
	int n, m, t, valor, s, q;
	vector<int>v;
	while(cin >> n >> m) {
		s=0;
		q=0;
		for(int i = 0; i < n; i++)
		{
			cin >> valor;
			v.push_back(valor);
			if (q < m) {
    			s += v[i];
    			q++;
			}
			else {
			    s -= v[i-m];
			    s += v[i];
			}
		}
		v.clear();
		printf("%d\n", s);
	}
	return 0;
}
