
/*
PROBLEMA:
2762 - Entrada e Saída 6
RESPOSTA:
Accepted
LINGUAGEM:
C++ (g++ 4.8.5, -std=c++11 -O2 -lm) [+0s]
TEMPO:
0.000s
TAMANHO:
417 Bytes
MEMÓRIA:
-
SUBMISSÃO:
24/05/2022 22:52:23
*/
#include <iostream>
#include <cstring>

using namespace std;

int main()
{
    string num;
    cin >> num;
    
    string part1 = num.substr(0, num.find("."));
    string part2 = num.substr(part1.length()+1, num.length());
    part2.erase(0, part2.find_first_not_of('0'));
    
    cout << part2 + "." + part1 << endl;

    return 0;
}
