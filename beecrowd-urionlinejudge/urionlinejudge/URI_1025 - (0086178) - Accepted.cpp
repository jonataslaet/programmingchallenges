#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int compare (const void * x, const void * y)
{
    return (*(int*)x - * (int*)y);
}

int main(){
    
    int i, z, n, q, j, t;
    int marbles[10000], queries[10000];
    
    for (z=0;z<65;z++){
        scanf("%d %d", &n, &q);
        if (n == 0 && q == 0) break;
        else{
            for (i=0;i<n;i++){
               scanf("%d", &marbles[i]);    
            } 
            qsort(marbles, n, sizeof(int), compare);  
            for (i=0;i<q;i++){
               scanf("%d", &queries[i]); 
            }
            printf("CASE# %d:\n", z+1);
            for (i=0;i<q;i++){
                t = 0;
                for (j=0;j<n;j++){
                    if (queries[i] == marbles[j]){
                       printf("%d found at %d\n", queries[i], j+1);
                       t++;
                       break; 
                    }
                }
                if (t == 0) printf("%d not found\n", queries[i]);
            } 
        } 
    }
    
    
    return 0;
}