#include <iostream>
using namespace std;

int main(int argc, char *argv[])
{
	int n, x;
	string statement;
	cin >> n;
	x = 0;
	for(int i = 0; i < n; i++)
	{
		cin >> statement;
		if (statement == "X++" || statement == "++X")
		{
			x++;
		}
		if (statement == "X--" || statement == "--X")
		{
			x--;
		}
	}
	cout << x << endl;
	return 0;
}