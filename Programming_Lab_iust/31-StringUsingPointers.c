// to display charactres of a string using pointers
#include <stdio.h>
int main(){
    char str[100];
    gets(str);

    char* pStr = str;

    while(*pStr != '\0'){
        printf("%c", *pStr);
        pStr++;
    }

    return 0;
}