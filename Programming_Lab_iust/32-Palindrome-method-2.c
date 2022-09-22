// to check palindrome using pointers
// method 2

#include <stdio.h>
int main(){
    char str[100];
    gets(str);

    char* pStr = str;
    char* eStr = pStr;
    
    int i = 0;
    while(str[i] != '\0'){
        eStr++;
        i++;
    }

    eStr--;
    int palindrome = 1;
    while(pStr <= eStr){
        if(*pStr != *eStr){
            palindrome = 0;
            break;
        }
        pStr++;
        eStr--;
    }

    palindrome ? printf("Is Palindrome\n") : printf("Not Palindrome\n");
    return 0;

}