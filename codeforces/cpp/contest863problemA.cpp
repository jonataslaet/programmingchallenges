#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cstdlib>
#include <vector>
using namespace std;

bool ehPalin(string s)
{
	int t = s.size();
	string s1, s2;
	if (t == 1 || (t == 2 && s[0] == s[1])) return true;
	else if (t % 2 != 0)
	{
		s1 = s.substr(0, ((t - 1) / 2));
		s2 = s.substr((t / 2) + 1, ((t - 1) / 2));

	}
	else
	{
		s1 = s.substr(0, (t / 2));
		s2 = s.substr((t / 2), (t / 2));
	}
	//cout << s1 << "-" << s2 << endl;
	reverse(s1.begin(), s1.end());
	if (s1 == s2) return true;
	else return false;
}

string qtdZero(string s)
{
	int t = s.size();
	string z;
	for(int i = t - 1; i >= 0; i--)
	{
		if (s[i] == '0') z.push_back('0');
		else break;
	}
	return z;
}
int main(int argc, char *argv[])
{
	string s, aux;
	cin >> s;
	aux = qtdZero(s) + s;
	if (ehPalin(s) || ehPalin(aux)) printf("YES\n");
	else printf("NO\n");
	return 0;
}