// to revese a given string

#include <stdio.h>
int main(){
    char str[100];
    gets(str);

    // Calculating size of string
    int i = 0; 
    while(str[i] != '\0')
        i++;


    // Reversing string
    int strStart = 0, strEnd = --i;

    while(strStart <= strEnd){
        char temp = str[strStart];
        str[strStart] = str[strEnd];
        str[strEnd] = temp;

        strStart++;
        strEnd--;
    }
    
    puts(str);
    return 0;
}