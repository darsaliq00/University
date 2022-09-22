// to find the lenght of a string without using library functions
#include <stdio.h>

int main(){
    char str[100];
    printf("Enter String: ");
    gets(str);

    int i = 0;
    while(str[i] != '\0'){
        i++;
    }

    printf("Size of String: (With Spaces Included) %d\n", i);

    return 0;
}