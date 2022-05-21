#include <iostream>
using namespace std;

int main()
{
    int sum = 0, n;
    int v[6] = {300, 1500, 600, 1000, 150, 225};
    
    for (int i = 0; i < 5; i++) {
        cin >> n;
        sum += (n * v[i]);
    }
    sum += v[5];
    cout << sum << endl;

    return 0;
}
