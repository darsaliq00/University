/*Write a program on data promotion which will promote char to int*/
#include <iostream>
using namespace std;
class Subtract
{
public:
    int Sub(int a, int b)
    {
        return a - b;
    }
    float Sub(float a, float b)
    {
        return a - b;
    }
};
int main(void)
{
    Subtract sub1;
    int x = sub1.Sub('h', 'e');
    cout << x;
}