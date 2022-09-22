// to create a structure of a student and create 5 instances of it 
#include <stdio.h>
typedef struct Student SS;

struct Student{
    int roll_no;
    char name[20];
    float marks;
};

void initializeStruct(SS* b, int pos){
    int roll; float marks;
    printf("    ----    RECORD FOR STUDENT %d   ----    \n", pos);
    printf("Enter Roll-Number: ");
    scanf("%d", &roll);
    printf("Enter Name: ");
    scanf(" %s", b->name);
    printf("Enter Marks: ");
    scanf("%f", &marks);

    b->roll_no = roll;
    b->marks = marks;
};

void printStructure(SS* b, int pos){
    printf("    ----    RECORD FOR STUDENT %d   ----    \n", pos);
    printf("Roll-Number: %d \n", b->roll_no);
    printf("Name: %s \n", b->name);
    printf("Marks: %0.2f \n", b->marks);
}

int main(){
    SS batch[5];
    int n = 5;
    for(int i = 0; i < n; i++)
        initializeStruct(&batch[i], i+1);

    for(int i = 0 ;i < n; i++)
        printStructure(&batch[i], i+1);

    return 0;
}