//bubble sort
#include <stdio.h>

void bubbleSort(int* arr, int s){
	int i , j;
	for(i = 0 ; i < s -1 ; i++){
		for(j = 0 ; j < s - i -1;j++){
			if(arr[j] > arr[j + 1]){
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}

int main(){
	int arr[100], s, i;
	printf("enter size of array : ");
	scanf("%d", &s);
	
	for(i = 0 ;i < s;i++){
		printf("enter element at position %d: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	bubbleSort(arr, s);
	
	printf("Sorted array : ");
	for(i = 0; i < s; i++){
		printf("%d ", arr[i]);
	}
	
	return 0;
}
