#include<stdio.h>
main( )
{
            float basic_sal,dear_al,house_rent_al,gross_sal;
            printf("enter the basic salary of ramesh\n");
            scanf("%f",&basic_sal);
            dear_al=0.4*basic_sal;
            house_rent_al=0.2*basic_sal;
            gross_sal= basic_sal*dear_al*house_rent_al;
            printf("dear allowence=%f\n",dear_al);
            printf("house rent allowence=%f\n",house_rent_al);
            printf("gross salary=%f\n",gross_sal);
            getchar();
           
}
