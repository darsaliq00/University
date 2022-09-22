#include<stdio.h>
int main()
{
	int i, j, number;
	printf("Enter a number : ");
	scanf("%d", &number);
	  for(i=1; i<=number; i++)
       {
       	j=j*i;
	   }
	   printf("Factorial of %d is %d",number, j);
	   return 0; 
}
