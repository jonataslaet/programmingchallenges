#include <stdio.h>
#include <stdlib.h>
#define t 10000

int compare (const void * x, const void * y)
{
    return (*(int*)x - * (int*)y);
}

int main(){
    
    int n, m, i, aux;
    int val[t];
    
    scanf("%i %i", &n, &m);
    
    for (i = 0; i < n; i++){
        scanf("%i", &val[i]);    
    }
    qsort(val, n, sizeof(int), compare);
    aux = n-1;
    for (i = 0; i < m; i++){
        printf("%i\n", val[aux]);
        aux--;    
    }
    
    return 0;    
}