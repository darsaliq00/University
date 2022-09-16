// to print an array 
#include <stdio.h>
int main(){
	int s,i;
	scanf("%d", &s);
	int arr[100];
	
	for(i = 0; i < s; i++)
		scanf("%d", &arr[i]);
	
	for(i = 0; i < s;i++)
		printf("%d ", arr[i]);
		
	return 0;
}
