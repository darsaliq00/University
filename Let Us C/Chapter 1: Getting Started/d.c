/*Temperature of a city in Fahrenheit degrees is input through the keyboard. 
Write a program to convert this temperature into Centigrade degrees. */
#include<stdio.h>
main( )
{
            float fahrenheit,degree_celsius;
            printf("enter the temperature in fahrenheit: ");
            scanf("%f",&fahrenheit);
            degree_celsius=((fahrenheit-32)*5)/9;
            printf("fehrenheit to celsius=%f\n",degree_celsius);
}
fahrenheit=(degree_celsius*9)/5+32;
