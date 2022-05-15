#include <iostream>
#include <string>

using namespace std;

int main()
{
    int n, i = 0;
    string question;
    cin >> n;
    cin.ignore();
    while(getline(cin, question) && i < n) {
        cout << "I am Toorg!" << endl;
        i++;
    }
    
    return 0;
}
