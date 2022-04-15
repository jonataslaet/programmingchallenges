#include <iostream>
using namespace std;

int main()
{
    int l, c;
    cin >> l >> c;
    cout << ((l % 2 == 0 && c % 2 == 0)||(l % 2 != 0 && c % 2 != 0)) << endl;
    return 0;
}
