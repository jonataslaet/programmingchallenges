#include <iostream>
#include <string>

using namespace std;

int main()
{
    string cpf, a, b, c, d;
    
    while(cin >> cpf) {
        a = cpf.substr(0, 3);
        b = cpf.substr(4, 3);
        c = cpf.substr(8, 3);
        d = cpf.substr(12,3);
        cout << a << endl;
        cout << b << endl;
        cout << c << endl;
        cout << d << endl;
    }
    
    return 0;
}