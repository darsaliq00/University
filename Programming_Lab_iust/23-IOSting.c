// to get a string from the user and output the same
#include <stdio.h>

int main(){
    char str[100];

    // method 1
    // using scanf / printf
    scanf(" %s", str);
    printf("str: %s\n", str);

    // method 2
    // using gets / puts
    gets(str);
    puts(str);

    return 0;
}