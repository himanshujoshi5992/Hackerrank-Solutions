#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int solve(int n, int p){
    int npfromback,npfromfront;
    if(p % 2 == 0)
        npfromfront = ceil((float)(p-1.0)/2.0);
    else
        npfromfront = (p-1)/2;
    
    if(n % 2 == 0) 
        npfromback = ceil((float)(n-p)/2);
    else 
        npfromback = floor((float)(n-p)/2);        

    return (npfromback < npfromfront)?npfromback:npfromfront;
}

int main() {
    int n; 
    scanf("%d", &n);
    int p; 
    scanf("%d", &p);
    int result = solve(n, p);
    printf("%d\n", result);
    return 0;
}
