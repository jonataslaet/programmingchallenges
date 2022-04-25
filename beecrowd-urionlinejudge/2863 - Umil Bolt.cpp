#include <iostream>

using namespace std;

int main()
{
    double n;
    double xi, menor;
    while(cin >> n){
        menor = 11.0;
        for (int i = 0; i < n; i++) {
            cin >> xi;
            if (xi < menor) menor = xi;
        }
        cout << menor << endl;
    }
    return 0;
}