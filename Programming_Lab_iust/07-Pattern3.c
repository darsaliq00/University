#include <stdio.h>
int main(){
	int i , j , k, l;
	for(i = 1; i <= 4; i++){
		for(j = 1; j < i;j++){
			printf(" ");
		}
	
		for(k = 4 ;k >= i; k--){
			printf("*");
		}
		
		for(l = i ; l<= 4; l++){
			printf("*");
		}
		printf("\n");
		
	}
	
	return 0;
}
