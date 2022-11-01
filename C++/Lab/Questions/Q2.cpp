#include<iostream>
using namespace std;
int main()
{
	float wt_lb,ht_in,bmi;
	cout<<"Enter your weight in pounds: ";
	cin>>wt_lb;
	cout<<"Enter your height in inches: ";
	cin>>ht_in;
	bmi=703*wt_lb/ht_in;
	if(bmi<18.5)
	{
		cout<<"Under weight";
	}
	else if(bmi>=18.5 && bmi<24.9)
	{
		cout<<"Normal";
	}
	else if(bmi>=25.0 && bmi<29.9)
	{
		cout<<"Overweight";
	}
	else if(bmi>=30)
	{
		cout<<"obese";
	}
}
