#include <iostream>
#include <string>
using namespace std;

int main()
{
    string word;
    cin >> word;
    word.length() > 9 ? "palavrao":"palavrinha";
    cout << (word.length() > 9 ? "palavrao":"palavrinha") << endl;

    return 0;
}