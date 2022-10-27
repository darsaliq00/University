/*Two numbers are input through the keyboard into two locations C and D. 
Write a program to interchange the contents of C and D. */
#include<stdio.h>
main( )
{
            int a,b,c;
            printf("enter the value of a and b\n");
            scanf("%d%d",&a,&b);
            c=a;
            a=b;
            b=c;
            printf("a changed to %d\n",a);
            printf("b changed to %d",b); 
}
