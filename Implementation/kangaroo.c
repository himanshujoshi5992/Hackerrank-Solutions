#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

char* kangaroo(int x1, int v1, int x2, int v2) {
    float n = (float)((x2 + v1)-(x1 + v2)) / (v1 - v2);
    int x = ceil(n);
    if ( x == n && n > 0)
    {
        return "YES";
    }
    else
    {
        return "NO";
    }
}

int main() {
    int x1; 
    int v1; 
    int x2; 
    int v2; 
    char *result;
    scanf("%i %i %i %i", &x1, &v1, &x2, &v2);
    if(x1 > x2)
        if(v2 > v1)
            result = kangaroo(x1, v1, x2, v2);
        else {
            printf("NO\n");
            return 0;
        }
    else
        if(v1 > v2)
            result = kangaroo(x1, v1, x2, v2);
        else {
            printf("NO\n");
            return 0;
        }
    
    printf("%s\n", result);
    return 0;
}

