//Variable por referencia 

#include <iostream>

using namespace std;

int main()
{
    int x=2, &y=x, z=8;
    cout << "x= "<<x <<endl
            << "y= "<<y <<endl;

    y =10;
    cout << "x= "<<x <<endl
            << "y = "<<y <<endl;

    y++;
    //Reasignar no esta permitido del
    /*
        y = &z;
        cout << "z= "<<z <<endl
                <<"y= "<<y <<endl;
*/


        cout <<"z= "<< z <<endl
            <<"y= "<<y <<endl;
    return 0;
}