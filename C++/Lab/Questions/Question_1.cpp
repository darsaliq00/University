#include<iostream>
using namespace std;
int main()
{
	float tch,cost,dis,stax;
	cout<<"press 1 for teacher and 0 if you are not a teacher";
	cin>>tch;
	if(tch==1)
	{
		cout<<"Enter cost";
		cin>>cost;
		if(cost<100)
		{
		dis=cost-(cost*0.1);
		stax=dis+(dis*0.05);
		cout<<"Total price to be paid "<<stax;
		}
		else
		{
		dis=cost-(cost*0.12);
		stax=dis+(dis*0.05);
		cout<<"Total price to be paid "<<stax;
		}
	}
	else
	{
		cout<<"Enter cost";
		cin>>cost;
		stax=cost+(cost*0.05);
		cout<<"Total price to be paid "<<stax;
	}
}
