#include <iostream>

using namespace std;

int main()
{
    string roberto = "Roberto";
    string numero = "5786";
    string unifei = "UNIFEI";
    for (int i = 0; i < 39; i++) {
        printf("-");
    }
    printf("\n");
    for (int i = 1; i < 6; i++) {
        for (int j = 0; j < 39; j++) {
            if (j == 0 || j == 38) {
                printf("|");
            }
            else if (i == 1 && j > 8 && j < 16) {
                printf("%c", roberto[j-9]);
            }
            else if (i == 3 && j > 8 && j < 13) {
                printf("%c", numero[j-9]);
            }
            else if (i == 5 && j > 8 && j < 15) {
                printf("%c", unifei[j-9]);
            }
            else {
                printf(" ");
            }
        }
        printf("\n");
    }
    for (int i = 0; i < 39; i++) {
        printf("-");
    }
    printf("\n");

    return 0;
}
