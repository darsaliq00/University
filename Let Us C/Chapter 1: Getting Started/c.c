/*If the marks obtained by a student in five different subjects are input through the keyboard, 
find out the aggregate marks and percentage marks obtained by the student. 
Assume that the maximum marks that can be obtained by a student in each subject are 100.*/
#include<stdio.h>
#include<conio.h>
int main()
{
 float a,b,c,d,e;
 printf("Enter the marks out of 100 in five subjects of the student : ");
 scanf("%f%f%f%f%f", &a,&b,&c,&d,&e);
 //his total marks
 printf("\n%f is the aggregate marks obtained by him.", a+b+c+d+e);
 //his percentage marks
 printf("\n%f is the percentage marks obtained by him.", (a+b+c+d+e)/5);
 getch();
 return 0;
}
