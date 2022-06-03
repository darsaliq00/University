#include<stdio.h>
int main()
{
	int a,b;
	char input;
	printf("Enter the value of a & b\n");
	scanf("%d %d",&a,&b);
	printf("Specify the operator");
	scanf("%c",&input);
	switch(input)
	{
	case '+': printf("The %d %c %d = %d",a,input,b,a+b);
	break;
	case '-': printf("The %d %c %d = %d",a,input,b,a-b);
	break;
	case '/': printf("The %d %c %d = %d",a,input,b,a/b);
	break;
	case '*': printf("The %d %c %d = %d",a,input,b,a*b);
	break;
	default: printf("Input a valid operator\n");
	}
}
