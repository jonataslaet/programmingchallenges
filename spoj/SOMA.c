#include <stdio.h>

int main(){
    
    int n, x, i, soma;
    
    scanf("%i", &n);
    soma = 0;
    for (i = 0; i < n; i++){
        scanf("%i", &x);
        soma = soma + x;
            
    }
    printf("%i", soma);
    
    return 0;   
}