#include <iostream>
 
using namespace std;
 
int max(int a, int b, int c) {
    int r = a;
    if (b > r) r = b;
    if (c > r) r = c;
    return r;
}

int main()
{
    int v, a, b, c = 0;
    cin >> v >> a >> b;
    c = v - a - b;
    cout<< max(a, b, c) << endl;

    return 0;
}