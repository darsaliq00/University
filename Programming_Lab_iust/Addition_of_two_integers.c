//Addition of two integers//
#include<stdio.h>
#include<conio.h>
int main()
{
	
	int a, b, sum;
	printf("Please Enter Two Integers : ");
	scanf("%d %d ", &a, &b);
	sum=a+b;
	
	printf("The Addition Of %d and %d is %d ", a, b, sum);
	
	getch();
	
	return 0;
}
