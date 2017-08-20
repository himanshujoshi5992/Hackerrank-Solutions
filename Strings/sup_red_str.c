#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

char* super_reduced_string(char* s){
    int p = -1;
    int len = strlen(s);
    for(int i = 0;i < len; i++) {
        if(i == 0) {
            if(s[i] == s[i+1]) {
                s[i+1] = s[i] = '\0';
                i++;
            }
            else {
                p = i;
            }
        }
        else if(s[i] == s[i+1] && i != 0) {
            if(p == -1 || p < 0) {
                s[i+1] = s[i] = '\0';
                i++;                
            } else {
                s[i] = '\0';
                if(s[p]) {
                    s[i+1] = s[p];
                } else {
                    s[i+1] = '\0';
                    i++;
                }
                
                s[p] = '\0';
                while(!s[--p]);
                               
            }

        }
        else if(s[i] != s[i+1]) {
            p = i;
        }
        
        for(int i = 0;i < len;i++) {
            if(s[i] != '\0') {
                printf("s[%d] = %c; ",i,s[i]);
                //status = 1;
            }
            else 
                printf("s[%d] = *; ",i);

        }
        printf("\n");
        
    }
    return s;
}

int main() {
    char* s = (char *)malloc(512000 * sizeof(char));
    scanf("%s", s);
    int status = 0;
    int len = strlen(s);
    char* result = super_reduced_string(s);
    for(int i = 0;i < len;i++) {
        if(result[i] != '\0') {
            printf("%c",result[i]);
            status = 1;
        }
    }
    if(!status) 
        printf("Empty String\n");
    
    return 0;
}

