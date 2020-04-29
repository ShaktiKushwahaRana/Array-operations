#include <iostream>
using namespace std;
int dateEnter( int dd,int mm,int yyyy)
{	cout<<dd<<"-"<<mm<<"-"<<yyyy<<endl;
}
int checkValidateDate(int dd,int mm,int yyyy)
{	int valid=1;
	if(dd>31)
    { valid=0;
    }
    if(mm>13)
    { valid=0;
    }
    if(yyyy<1)
    { valid=0;
    }
    
	if(valid==0)
	{	cout<<"date is invalid";
	}
	else
	{	cout<<"date is valid";
	}	
}
int main()
{
	int dd,mm,yyyy;
	cout<<"enter the date "<<endl;
	cin>>dd;
	cout<<"enter the month "<<endl;
	cin>>mm;
	cout<<"enter the year "<<endl;
	cin>>yyyy;
	dateEnter(dd, mm, yyyy);
	checkValidateDate(dd,mm,yyyy);


}
