#include<stdio.h>
int add(int, int);
int sub(int, int);
int mult(int, int);
float div(int, int);
int main()
{
	double f;
	int a,b,c,d,e;
	printf("Enter two numbers : ");
	scanf("%d %d", &a, &b);
	c=add(a,b);
	printf("The addition is %d\n", c);
	d=sub(a,b);
	printf("The subtract is %d\n", d);
	e=mult(a,b);
	printf("The multiplication is %d\n", e);
	f=div(a,b);
	printf("The division is %f\n", f);
	return 0;
}
int add(int a, int b)
{
	int c;
	c=a+b;
	return(c);
	
}
int sub(int a, int b)
{
	int c;
	c=a-b;
	return(c);
	
}
int mult(int a, int b)
{
	int c;
	c=a*b;
	return(c);
	
}
float div(int a, int b)
{
	float c;
	c=a/b;
	return(c);
	
}
