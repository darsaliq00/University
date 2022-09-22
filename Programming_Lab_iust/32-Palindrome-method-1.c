// to check whether a string is palindrome or not
// method 1
// without using pointers

#include <stdio.h>
int main(){
    char str[100];
    gets(str);

    int i = 0; 
    while(str[i] != '\0'){
        i++;
    }
    
    int startIndex = 0, endIndex = --i, palindrome = 1;
    while(startIndex <= endIndex){
        if(str[startIndex] != str[endIndex]){
            palindrome = 0;
            break;
        }
        startIndex++;
        endIndex--;
    }

    palindrome ? printf("Is Palindrome\n") : printf("Not Palindrome\n");
    return 0;
}