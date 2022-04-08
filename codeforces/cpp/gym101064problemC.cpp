#include <iostream>
#include <cstring>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <vector>
#include <iomanip>
#include <algorithm>
using namespace std;

int main(int argc, char *argv[])
{
	int somaMaior = 0, a, h, w, o=0, l=0;
	vector <int> east;
	vector <int> west;
	double result;
	scanf("%d %d", &h, &w);
	for (int i = 0; i < h; i++)
	{
		scanf("%d", &a);
		east.push_back(a);
	}
	for (int i = 0; i < h; i++)
	{
		scanf("%d", &a);
		west.push_back(a);
		if (east[i] + west[i] > somaMaior)
		{
			somaMaior = east[i] + west[i];
			o = east[i];
			l = west[i];
		}
	}
	result = ((double)w - (double)somaMaior)/2.0;
	
	cout << result <<endl;
	return 0;
}
