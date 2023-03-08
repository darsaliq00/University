#include<iostream>
#include<cmath>

using namespace std;
double power(double x, double y)
{
	return pow(x,y);
}
double power (int x, int y)
{
	return pow(x,y);
}

int main()
{
	cout<<power(11.55, 6.4)<<endl;
	cout<<power(11, 6)<<endl;
	cout<<power(11, 12)<<endl;
	cout<<power('A', 'A')<<endl;
}
