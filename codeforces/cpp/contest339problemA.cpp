#include <iostream>
#include <cstring>
#include <algorithm>
#include <vector>
#include <cstdio>
#include <cmath>
using namespace std;

int main(int argc, char *argv[])
{
	string exp;
	int t;
	vector <int>v;
	cin >> exp;

	t = exp.size();
	for(int i = 0; i < t; i = i + 2)
	{
		v.push_back(exp[i] - '0');
	}
	t = v.size();
	sort(v.begin(), v.end());
	for(int i = 0; i < t; i++)
	{
		if (i + 1 < t) printf("%d+", v[i]);
		else printf("%d", v[i]);
	}
	return 0;
}