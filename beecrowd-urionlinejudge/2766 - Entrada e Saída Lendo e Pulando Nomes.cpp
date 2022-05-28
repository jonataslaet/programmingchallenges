#include <iostream>
#include <vector>
using namespace std;

int main()
{
    string nome;
    vector<string> nomes;
    
    for (int i = 0; i < 10; i++) {
        cin >> nome;
        nomes.push_back(nome);
    }
    cout << nomes[2] << endl;
    cout << nomes[6] << endl;
    cout << nomes[8] << endl;

    return 0;
}
