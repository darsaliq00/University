#include<stdio.h>
int main()
{
	int a,b,c;
	 printf ("please enter three distinct integers");
	 scanf("%d%d%d",&a,&b,&c);
	 if(a>b && a>c)
	 {
	  printf ("%d is greatest",a);
	 }
	 else  if(b>a && b>c )
	 {
	 	printf ("%d is greatest",b);
	 }
	 else  if (c>a && c>b) 
	 {
	 	printf ("%d is greatest",c);
	 }
	 return 0;
}
	 
	 
