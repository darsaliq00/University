#include <stdio.h>
int getFactorial(int x){
	if(x == 0) return 1;
	return x * getFactorial(x - 1);
}

int main(){
	int n;
	scanf("%d", &n);
	
	printf("%d", getFactorial(n));
	
	return 0;
}
