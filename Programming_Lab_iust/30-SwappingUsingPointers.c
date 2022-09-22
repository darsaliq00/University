// to swap two numbers using pointers
#include <stdio.h>

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    int x = 1, y = 2;
    swap(&x, &y);
    printf("%d %d", x, y);
}