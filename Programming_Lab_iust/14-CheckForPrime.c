// to check whether a number is prime or not using functions
#include <stdio.h>

int isPrime(int n){
	int i;
	if(n == 1) return 0;
	if(n == 2) return 1;
	
	for(i = 2; i <= n/2; i++){
		if(n % i == 0)
			return 0;
	}
	
	return 1;
}

int main(){
	int n;
	printf("Enter number: ");
	scanf("%d", &n);
	
	if(isPrime(n))
		printf("%d is PRIME \n", n);
	else
		printf("%d is NOT PRIME!!", n);
		
	return 0;
}
