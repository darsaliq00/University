/*    The distance between two cities (in km.) is input through the keyboard.
Write a program to convert and print this distance in meters, feet, inches and centimeters.*/
#include<stdio.h>
main( )
{
            float km,meter,feet,inch,cm;
            printf("enter the distance between the two cities in kilometeres: ");
            scanf("%f",&km);
            meter=1000*km;
            inch=39.3700787*meter;
            feet=3.2808399*meter;
            cm=100*meter;
            printf("distance between the two cities in meter=%f\n",meter);
            printf("distance between the two cities in inch=%f\n",inch);
            printf("distance between the two cities in feet=%f\n",feet);
            printf("distance between the two cities in centi-meter=%f\n",cm);
            getchar();                    
}
