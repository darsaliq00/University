#include <iostream>
#include <cmath>
using namespace std;
class Calculator 
{
	public : 
	double power (double base, double exponent)
	{
		return pow(base, exponent);
	}
	double power (char base, int exponent)
	{
		return pow((double)base, (double)exponent);
	}
	double power(int base, int exponent)
	{
		return pow ((double)base, (double)exponent);
	}
	double power(long base, int exponent)
	{
		return pow((double)base,(double)exponent);
	}
	double power(float base, float exponent)
	{
		return pow((double)base,(double)exponent);
	}
};
int main()
{
	Calculator c;
	cout<<c.power(2.0,3.0)<<endl;
	cout<<c.power('a',3)<<endl;
	cout<<c.power(2,3)<<endl;
	cout<<c.power(214156,2)<<endl;
	cout<<c.power(1.5f,2.0f)<<endl;
}
