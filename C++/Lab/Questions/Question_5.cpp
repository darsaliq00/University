#include<iostream>
using namespace std;
int main()
{
	int x,y;
	cout<<" 1 carbon monooxide\n 2 Hydrocarbons\n 3 Nitrogen oxide\n 4 nonmethane Hydrocarbons\n";
	cout<<"Enter polutant number ";
	cin>>x;
	cout<<"Enter odometer reading ";
	cin>>y;
	switch(x)
	{
	
	case 1 :
	
		if(y<=50000)
		cout<<"Emissiom exceed permitted level of 3.4 grams/mile";
		else
		cout<<"Emission exceed permitted level of 4.2 grams/mile";
		break;
	
	case 2 :
	
		if(y<=50000)
		cout<<"Emissiom exceed permitted level of 0.31 grams/mile";
		else
		cout<<"Emission exceed permitted level of 0.39 grams/mile";
		break;
	
	case 3 :
	
		if(y<=50000)
		cout<<"Emissiom exceed permitted level of 0.4 grams/mile";
		else
		cout<<"Emission exceed permitted level of 0.5 grams/mile";
		break;
	
	case 4 :
	
		if(y<=50000)
		cout<<"Emissiom exceed permitted level of 0.25 grams/mile";
		else
		cout<<"Emission exceed permitted level of 0.31 grams/mile";
		break;
	
	default :
		 
		  cout<<"invalid";
	}
	return 0;
}
