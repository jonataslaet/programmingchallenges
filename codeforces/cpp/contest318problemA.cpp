#include <iostream>
#include <cmath>
using namespace std;

int main(int argc, char *argv[])
{
	int64_t n, k;

	cin >> n >> k;

	if (n % 2 == 0)
	{
		if (1 + 2 * (k - 1) < n) cout << (1 + 2 * (k - 1)) << endl;	
		else cout << 1 + (1 + 2 * (k - 1)) % n << endl;		
	}
	else
	{
		if (1 + 2 * (k - 1) <= n) cout << (1 + 2 * (k - 1)) << endl;
		else cout << 1 + (2 * (k - 1)) % n << endl;	
	}

	return 0;
}