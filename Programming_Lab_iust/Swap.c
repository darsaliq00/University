#include<stdio.h>
int main()
{
    int x,y,temp;
	printf("Enter first Number : ");
	scanf("%d", &x);
	printf("Enter second Number : ");
	scanf("%d", &y);
	
    temp=x;
	x=y;
	y=temp;
	
	printf("\nAfter swapping %d = x, %d = y", x,y);	
			
	return 0;
}
