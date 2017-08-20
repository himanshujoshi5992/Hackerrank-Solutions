#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int solve(int n, int s_size, int* s, int d, int m){
    int sum = 0,count = 0;
    for(int i = 0;i <= n-m;i++) {
        for(int j = 1;j <= m-1;j++) {
            if(i + j < n)
                sum += s[i + j];
            //printf("%d\n", sum);
        }     
        if(d == sum+s[i])
            count++;
        //printf("%d\n", sum+s[i]);
        sum = 0;
        
    }
    return count;
}

int main() {
    int n; 
    scanf("%d", &n);
    int *s = malloc(sizeof(int) * n);
    for(int s_i = 0; s_i < n; s_i++){
       scanf("%d",&s[s_i]);
    }
    int d; 
    int m; 
    scanf("%d %d", &d, &m);
    int result = solve(n, n, s, d, m);
    printf("%d\n", result);
    return 0;
}
