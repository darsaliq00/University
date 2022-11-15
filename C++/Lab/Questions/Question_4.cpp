#include<iostream>
using namespace std;
int main()
{
	float x,y;
	cout<<"Enter the value of x and y\n";
	cin>>x>>y;
	if(x>0.0&&y>0.0)
	{
		cout<<"Point is in 1st quadrant";
	}
		if(x<0.0&&y>=0.0)
	{
		cout<<"Point is in 2nd quadrant";
	}
		if(x<0.0&&y<0.0)
	{
		cout<<"Point is in 3rd quadrant";
	}
		if(x>=0.0&&y<0.0)
	{
		cout<<"Point is in 4th quadrant";
	}
		if(x==0.0&&y>=0.0)
	{
		cout<<"Point is on y axis";
	}
        if(x>=0&&y==0)
	{
		cout<<"Point is on x axis";
		
    }
		if(x==0.0&&y==0.0)
	{
		cout<<"Point is at center";
	}
	return 0;
}
