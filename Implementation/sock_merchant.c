#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int sockMerchant(int n, int* ar) {
    int count = 0;

    for(int i = 1;i <= 100;i++) {

        count += (ar[i] / 2);

    }
    return count;
}

int main() {
    int n,colour; 
    scanf("%i", &n);
    int *ar = malloc(sizeof(int) * 100);
    
    for(int i = 1;i <= 100;i++) {
        ar[i] = 0;
    }
    
    for(int ar_i = 0; ar_i < n; ar_i++){
        scanf("%i",&colour);
        ar[colour]++;
    }
    
    int result = sockMerchant(n, ar);
    printf("%d\n", result);
    return 0;
}
