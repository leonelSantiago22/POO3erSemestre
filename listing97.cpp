#include <iostream>
#include <exception>

using namespace std; 

int main()
{
    try { 
        //throw 10;
        int* myarray = new int [10000000000000];
    }catch(exception& e)
    {
        cout<< " Exception estandar: "<<e.what()<<endl;
    }
    return 0;
}