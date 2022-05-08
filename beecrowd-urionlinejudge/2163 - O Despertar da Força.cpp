#include <iostream>
#define MAX 1000

using namespace std;

bool isValidThreeAbove(int mapa[MAX][MAX], int n, int m, int i, int j) {
    bool result = true;
    if (i-1>=0 && j-1 >= 0 && j+1 < m){
        if (mapa[i-1][j-1]!=7) {
            return false;
        }
        if (mapa[i-1][j]!=7) {
            return false;
        }
        if (mapa[i-1][j+1]!=7) {
            return false;
        }
    }
    if (i-1>=0 && j-1 < 0 && j+1 < m){
        if (mapa[i-1][j]!=7) {
            return false;
        }
        if (mapa[i-1][j+1]!=7) {
            return false;
        }
    }
    if (i-1>=0 && j-1 >= 0 && j+1 >= m){
        if (mapa[i-1][j]!=7) {
            return false;
        }
        if (mapa[i-1][j-1]!=7) {
            return false;
        }
    }
    return true;
}

bool isValidLeftAndRight(int mapa[MAX][MAX], int n, int m, int i, int j) {
    bool result = true;
    if (j-1 >= 0 && j+1 < m){
        if (mapa[i][j-1]!=7) {
            return false;
        }
        if (mapa[i][j+1]!=7) {
            return false;
        }
    }
    if (j-1 < 0 && j+1 < m){
        if (mapa[i][j+1]!=7) {
            return false;
        }
    }
    if (j-1 >= 0 && j+1 >= m){
        if (mapa[i-1][j]!=7) {
            return false;
        }
        if (mapa[i-1][j-1]!=7) {
            return false;
        }
    }
    return true;
}

bool isValidThreeUnder(int mapa[MAX][MAX], int n, int m, int i, int j) {
    bool result = true;
    if (i+1<n && j-1 >= 0 && j+1 < m){
        if (mapa[i+1][j-1]!=7) {
            return false;
        }
        if (mapa[i+1][j]!=7) {
            return false;
        }
        if (mapa[i+1][j+1]!=7) {
            return false;
        }
    }
    if (i+1<n && j-1 < 0 && j+1 < m){
        if (mapa[i+1][j]!=7) {
            return false;
        }
        if (mapa[i+1][j+1]!=7) {
            return false;
        }
    }
    if (i+1<n && j-1 >= 0 && j+1 >= m){
        if (mapa[i+1][j]!=7) {
            return false;
        }
        if (mapa[i+1][j-1]!=7) {
            return false;
        }
    }
    return true;
}

int main()
{
    int p, q, n, m, x = 0, y = 0;
    int mapa[1000][1000];
    cin >> n >> m;
    bool result = true;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> mapa[i][j];
        }
    }
    p = n-1;
    q = m-1;
    for (int i = 1; i < p; i++) {
        for (int j = 1; j < q; j++) {
            if (mapa[i][j] == 42) {
                if (isValidThreeAbove(mapa, n, m, i, j) && isValidLeftAndRight(mapa, n, m, i, j) && isValidThreeUnder(mapa, n, m, i, j)) {
                    x = i+1; y = j+1;
                    break;
                }
            }
        }
    }

    printf("%d %d\n", x, y);

    return 0;
}
