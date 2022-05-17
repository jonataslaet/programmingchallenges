#include <iostream>
 
using namespace std;
 
int main() {
 
    int c[4];
    cin >> c[0] >> c[1] >> c[2] >> c[3];
    if (c[0] == 1) {
        cout << "1" << endl;
    }
    else if (c[1] == 1) {
        cout << "2" << endl;
    }
    else if (c[2] == 1) {
        cout << "3" << endl;
    }
    else {
        cout << "4" << endl;
    }
 
    return 0;
}