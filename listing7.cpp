#include <iostream>

using namespace std;

int main()
{
    int *p, *q;
    p = new int;
    if (!p)
    {
        cout<< "No se pudo asignar memoria \n";
        return 0;
    }
    *p = 100;
    
    cout <<endl<<*p <<endl;

    q = new int(123);

    cout<<endl<<*q<<endl;

    delete p;

    delete q;

    return 0;
    
}