#include <iostream>

using namespace std;

int main()
{
    int v[26];
    char e = 'e';
    v[0]=97;
    printf("%d %c %c\n", v[0], e, v[0]);
    for(int i = 1; i < 26; i++) {
        v[i] = v[i-1]+1;
        printf("%d %c %c\n", v[i], e, v[i]);
    }

    return 0;
}