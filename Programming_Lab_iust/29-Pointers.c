// to display address of an integer vaiable
#include <stdio.h>
int main(){
    int i = 10;
    int* p = &i;

    printf("%d\n" , i);
    printf("%d\n", &i);
    printf("%d\n", *p);
    printf("%d\n", p);
}