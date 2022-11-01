#include<iostream>
using namespace std;
int main()
{
	float n;
	cout<<"Enter earthquake intensity: ";
	cin>>n;
	if(n<5.0)
	{
		cout<<"Little or no damage";
	}
	else if(n>=5.0 && n<5.5)
	{
		cout<<"Some damage";
	}
	else if(n>=5.5 && n<6.5)
	{
		cout<<"Serious damage";
	}
	else if(n>=6.5 && n<7.5)
	{
		cout<<"Disaster";
	}
	else if(n>=7.5)
	{
		cout<<"Catastrophe";
	}
}
