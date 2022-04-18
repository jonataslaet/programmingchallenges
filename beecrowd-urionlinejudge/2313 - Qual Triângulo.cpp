#include <iostream>
using namespace std;
 
bool isValidTrangle(int a, int b, int c)
{
	return ((a + b) > c && c >= b && c >= a) || ((a + c) > b && b >= a && b >= c) || ((b + c) > a && a >= b && a >= c);
}

bool isRetanguleTriangle(int a, int b, int c)
{
    if (a >= b && a >= c)
    {
        return (a*a == b*b + c*c);
    }
    else if (b >= a && b >= c)
    {
        return (b*b == a*a + c*c);
    }
    else if (c >= b && c >= a)
    {
        return (c*c == b*b + a*a);
    }
    else return false;
}
int main() {
 
    int a, b, c;
    cin >> a >> b >> c;
    if (!isValidTrangle(a, b, c)) printf("Invalido\n");
    else
    {
        if (a == b && a == c) 
        {
            printf("Valido-Equilatero\n");
            if (isRetanguleTriangle(a, b, c)) printf("Retangulo: S\n");
            else printf("Retangulo: N\n");
        }
        else if (a != b && a != c && b != c) 
        {
            printf("Valido-Escaleno\n");
            if (isRetanguleTriangle(a, b, c)) printf("Retangulo: S\n");
            else printf("Retangulo: N\n");
        }
        else 
        {
            printf("Valido-Isoceles\n");
            if (isRetanguleTriangle(a, b, c)) printf("Retangulo: S\n");
            else printf("Retangulo: N\n");
        }
    }
 
    return 0;
}