/*If the marks obtained by a student in five different subjects are input through the keyboard, 
find out the aggregate marks and percentage marks obtained by the student. 
Assume that the maximum marks that can be obtained by a student in each subject are 100.*/
#include<stdio.h>
main( )
{
            int sub1,sub2,sub3,sub4,sub5,aggregate;
            float percentage;
            printf("the marks obtained in each subject:\n");
            scanf("%d%d%d%d%d",&sub1,&sub2,&sub3,&sub4,&sub5);
            aggregate=sub1+sub2+sub3+sub4+sub5;
            percentage=aggregate/5;
            printf("aggregate=%d\n",aggregate);
            printf("percentage=%f",percentage);
}
