#include<bits/stdc++.h>
using namespace std;

int main()
{
    cout<<"Pattern one"<<endl;
  
    for(int i=0;i<=5;i++)
    {
        for(int j=0;j<=5;j++)
        {
            if(i>=j)
            {
              cout<<" * ";
            }
            else
                cout<<"   ";
             
        }
        cout<<endl;
    }
    return 0;
}
