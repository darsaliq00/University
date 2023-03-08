/*Write a programm on a overload function which will take two arguments
int and string(i.e in concatenate form) using classes*/
#include <iostream>
using namespace std;
class Overload
{
public:
    int Sum(int, int);
    string Sum(string, string);
};
int Overload ::Sum(int a, int b)
{
    return a + b;
}
string Overload::Sum(string a, string b)
{
    return a + b;
}
int main(void)
{
    Overload load1;
    int x = load1.Sum(10, 20);
    cout << x << endl;
    string s = load1.Sum("Infor", "mation");
    cout << s;
}