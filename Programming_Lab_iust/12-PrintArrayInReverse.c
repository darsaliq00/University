// print array in reverse order
#include <stdio.h>
int main(){
	int arr[6] = {1, 2, 3, 4, 5, 6};
	int i;
	for(i = 6 - 1; i >= 0; i--){
		printf("%d", arr[i]);
	}
	
	return 0;
}
