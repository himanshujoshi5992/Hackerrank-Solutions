#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int s; 
    int t; 
    
    scanf("%d %d",&s,&t);
    int a; 
    int b; 
    scanf("%d %d",&a,&b);
    int m; 
    int n; 
    int f_dist,d_dist;
    int a_count = 0,o_count = 0;
    
    for(int apple_i = 0; apple_i < m; apple_i++){
        //printf("%d",a_count);
        scanf("%d",&f_dist);
        if((f_dist + a >= s) && (f_dist + a <= t))
            a_count++;
        
    }
    
    for(int orange_i = 0; orange_i < n; orange_i++){
        //printf("%d",o_count);
        scanf("%d",&d_dist);
        if((d_dist + b >= s) && (d_dist + b <= t))
            o_count++;
        
    }
    printf("%d\n%d",a_count,o_count);
    return 0;
}

