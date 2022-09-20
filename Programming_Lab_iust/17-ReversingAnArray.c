//reverse an array
#include <stdio.h>

void reverse(int* arr, int n){
	int l = 0;
	int u = n - 1;
	
	while(l < u){
		int temp = arr[l];
		arr[l] = arr[u];
		arr[u] = temp;
		
		l++;
		u--;
	}
}

int main(){
	int i,n;
	int arr[100];
	
	printf("Enter the size of the array:");
	scanf("%d", &n);
	
	for(i = 0; i < n; i++){
		printf("Enter the element at %d: ", i);
		scanf("%d", &arr[i]);
	}
	
	printf("Original Array\n");
	for(i = 0 ; i < n; i++)
		printf("%d ", arr[i]);
		
	reverse(arr, n);
	printf("\n");
	
	printf("Reveresed Array\n");
	for(i = 0 ; i < n; i++)
		printf("%d ", arr[i]);
	
		
	return 0;
}

