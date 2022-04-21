#include <iostream>
using namespace std;

int main()
{
    int n, q=0;
    while(cin >> n){
        q = 0;
        while(n > 1) {
            q++;
            n /= 2;
        }
        cout << q << endl;
    }
    return 0;
}