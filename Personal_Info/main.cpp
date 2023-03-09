#include <iostream>

using namespace std;
char fname[10];
char lname[12];
char dept[20];
int Age;
char sex[7];
int Display_Menu()
{
    cout <<"MY  PERSONAL  INFORMATION" << endl;
    cout<<"Firstname: "<<fname<<endl;
    cout<<"Lastname: "<<lname<<endl;
    cout<<"Age:"<<Age<<endl;
    cout<<"Gender:"<<sex<<endl;
    cout<<"Department:"<<dept<<endl;
}

        int main()
        {
    cout << " Enter Your Firstname:";
    cin>>fname;
    cout << " Enter Your Lastname:";
    cin>>lname;
    cout << " Enter Your Age:";
    cin>>Age;
    cout << " Enter Your Gender:";
    cin>>sex;
    cout << " Enter Your Department:";
    cin>>dept;
    cout<<endl<<endl<<endl;
    cout<<Display_Menu();

            return 0;

        }






