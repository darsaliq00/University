//binary search
#include <stdio.h>

int binarySearch(int* arr, int s, int key){
	int lower = 0;
	int upper = s - 1;
	
	while(lower < upper){
		int mid = (lower + upper ) / 2;
		if(key > arr[mid]){
			lower = mid + 1;
		}else if(key < arr[mid]){
			upper = mid - 1;
		}else if(key == arr[mid]){
			return mid;
		}
	}
}

int main(){
	int arr[6] = {11, 12,14, 16, 17, 21};
	int s = 6;
	int key;
	scanf("%d", &key);
	
	printf("Element is present at position %d\n", binarySearch(arr, s, key) + 1);
	
	return 0;
}
