#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    int n,rem; 
    scanf("%d", &n);
    int *grades = malloc(sizeof(int) * n);
    for(int grades_i = 0; grades_i < n; grades_i++){
       scanf("%d",&grades[grades_i]);
       rem = grades[grades_i] % 5;
       if(grades[grades_i] >= 38 && (rem >= 3)) {
           printf("%d\n",grades[grades_i] + (5 - rem));
       }
       else 
           printf("%d\n",grades[grades_i]);
    }
    return 0;
}

