// linear search
#include <stdio.h>
int main(){
	int key, i, found = 0;
	int arr[5] = {5, 2, 56, 8, 1};
	
	printf("Enter element to Search: ");
	scanf("%d", &key);
	
	for(i = 0; i < 5; i++){
		if(arr[i] == key){
			printf("Elements is present in the array at %d", i+1);
			found = 1;
			break;
		}
	}
	
	if(!found)
		printf("Element is not present in the array");
		
	return 0;
}
