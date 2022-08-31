//to compare three distinct integers
#include<stdio.h>
int main ()
{
	int a, b, c ;
	printf("Enter three distinct Integers : ");
	scanf("%d %d %d ", &a, &b, &c);
	if (a>b && a>c)
     {
	  printf("%d is the greatest", a);
	 }
	else if (b>c && b>a)
	{
	  printf("%d is greatest", b);
	}
	else if(c>a && c>b)
	{ 
	  printf("%d is the greatest", c);
	}
	getch();
	
	return 0;
}
