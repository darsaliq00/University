#include<stdio.h>
int main()
{
	int x[10];
	int i;
	for(i=0; i<=10; i++)
	scanf("%d", &x[i]);
	for(i=0; i<=9; i++)
	printf("%d  ", x[i]);
}
