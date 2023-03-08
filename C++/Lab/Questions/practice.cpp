#include <iostream>
using namespace std;
int Sum(int a, int b)
{
    return a + b;
}
float Sum(float a, float b)
{
    return a + b;
}
string Sum(string a, string b)
{
    return a + b;
}
int main(void)
{
    int a = Sum(12, 13);
    cout << a << endl;
    float f = Sum(1.3, 1.4);
    cout << b << endl;
    string s = Sum("Infor", "mation");
    cout << s << endl;
}