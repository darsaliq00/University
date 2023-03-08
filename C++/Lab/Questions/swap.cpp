#include<iostream>

using namespace std;
void swap(int &a, int &b)
{
	int t;
	t=a;
	a=b;
	b=t;
}
int main()
{
	int a=1, b=2;
	cout<<a<<b<<endl;
	swap(a,b);
	cout<<a<<b<<endl;
}
