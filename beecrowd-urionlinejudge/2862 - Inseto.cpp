#include <iostream>

using namespace std;

int main()
{
    int c, n;
    cin >> c;
    while(cin >> n) {
        if (n > 8000) {
            cout << "Mais de 8000!" << endl;
        } else {
            cout << "Inseto!" << endl;
        }
    }
    

    return 0;
}
