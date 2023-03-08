#include <iostream>
using namespace std;
class Student
{
public:
    string Name;
    int RollNo;
    float Marks;

public:
    void ShowDetails()
    {
        cout << "Name : " << Name << endl;
        cout << "Roll Number : " << RollNo << endl;
        cout << "Marks : " << Marks << endl;
    }
};
int main(void)
{
    Student s1;
    s1.Name = "Adam Williams";
    s1.RollNo = 65;
    s1.Marks = 98;
    s1.ShowDetails();
}