// to find the sum of elements of an array using functions

#include <stdio.h>
#include <stdlib.h>
int sumOfArray(int* arr, int n){
    int sum = 0;
    for(int i = 0 ; i < n; i++)
        sum += arr[i];

    return sum;
}

void readArray(int* arr , int n){
    for(int i = 0; i < n; i++)
        scanf("%d", arr + i);
}

int main(){
    int n; 
    printf("Enter size of Array: ");
    scanf("%d", &n);

    int* arr = (int*)malloc(n*sizeof(int));
    readArray(arr, n);

    printf("Sum of Elemts is : %d", sumOfArray(arr, n));
    return 0;

}