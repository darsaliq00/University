//insertion sort
#include <stdio.h>

void insertionSort(int*, int);

int main(){
	int i,j, n;
	int arr[100];
	
	printf("Enter the size of the array");
	scanf("%d", &n);
	
	for(i = 0 ; i < n; i++){
		printf("Enter element at position %d: ", i);
		scanf("%d", &arr[i]);
	}
	insertionSort(arr, n);
	
	for(i = 0 ; i < n;i++)
		printf("%d",arr[i]);
	
	return 0;
	
}

 void insertionSort(int* arr, int n){
 	int i;
		for( i = 1 ; i < n; i++){
			int j = i - 1;
			int key = arr[i];
			
			while(j >= 0 && key < arr[j]){
				arr[j + 1] = arr[j];
				j--;
			}
			
			j++;
			arr[j] = key;
		}
	}
