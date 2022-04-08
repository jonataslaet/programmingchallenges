#include <iostream>
#include <vector>
#include <cstdio>
#include <cmath>
#include <cstring>
using namespace std;

int main(int argc, char *argv[])
{
	string w1, w2;
	int t, s = 0;
	cin >> w1 >> w2;
	t = w1.size();
	for(int i = 0; i < t; i++)
	{
		if (((tolower(w1[i])) - '0') < ((tolower(w2[i])) - '0'))
		{
			 s = -1;
			 break;
		}
		else if (((tolower(w1[i])) - '0') > ((tolower(w2[i])) - '0'))
		{
			 s = 1;
			 break;
		}
	}
	printf("%d\n", s);

	return 0;
}