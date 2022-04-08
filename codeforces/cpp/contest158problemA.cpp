#include <iostream>
#include <vector>
using namespace std;

int main(int argc, char *argv[])
{
	int n, k, cont, K, score, scoreDoK;
	vector <int> v;
	cin >> n >> k;
	K = k - 1;
	scoreDoK = 1000;
	for(int i = 0; i < n; i++)
	{
		cin >> score;
		v.push_back(score);
		if (i == K)
		{
			scoreDoK = score;
		}
	}
	cont = 0;
	for(int i = 0; i < n; i++)
	{
		if (v[i] > 0 && v[i] >= scoreDoK) cont++;
	}
	cout << cont << endl;
	return 0;
}