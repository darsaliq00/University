// fibonaci series
#include <stdio.h>

int main(){
	int a, b, i, num;
	printf("Enter the Limit");
	scanf("%d", &num);
	a = b = 1;
	printf("%d %d ", a, b);
	
	for(i = 1; i <= num; i++){
		int c=  a + b;
		printf("%d ", c);
		a = b;
		b = c;
	}
	return 0;
}
