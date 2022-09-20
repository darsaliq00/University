//selection sort
#include <stdio.h>

void selectionSort(int*, int);

int main(){
	int size, arr[100];
	int i , j;
	
	printf("Enter the size of the array\n");
	scanf("%d", &size);
	
	for(i = 0 ; i < size ; i++){
		printf("Enter the Element at %d", i);
		scanf("%d", &arr[i]);
	}
	
	selectionSort(arr, size);
	
	for(i = 0 ; i < size; i++)
		printf("%d", arr[i]);
		
	return 0;
}

void selectionSort(int* arr, int n){
	int i , j;
	
	for(i = 0 ; i < n;i++){
		int minIndex = i;
		for(j = i + 1; j < n;j++){
			if(arr[minIndex] > arr[j]){
				minIndex = j;
			}
		}
		
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}
}

