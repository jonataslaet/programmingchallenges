#include <iostream>

using namespace std;

int main()
{
    int d, p = 1;
    cin >> d;
    if (d > 800 && d <= 1400) p = 2;
    else if (d > 1400 && d <= 2000) p = 3;
    printf("%d\n", p);

    return 0;
}