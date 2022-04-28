#include <iostream>

using namespace std;

int main()
{
    int a,b,c,x,y,z,s=0;
    cin >> a >> b >> c;
    cin >> x >> y >> z;
    if (x > a) s += x - a;
    if (y > b) s += y - b;
    if (z > c) s += z - c;
    printf("%d\n",s);
    return 0;
}