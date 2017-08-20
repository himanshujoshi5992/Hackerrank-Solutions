#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    char* ch = (char*) malloc((n) * sizeof(char));
    scanf("%s", ch);
    
    int sea=0;
    int counter=0;
    
    
    for(int i=0;i<n;i++){
        if(ch[i]=='D') { 
            sea--;
            if(!sea) continue;
         }
        else if(ch[i]=='U') 
            sea++; 
       
        if(!sea) counter++;
        
    }
    printf("%d",counter);
    return 0;
}
