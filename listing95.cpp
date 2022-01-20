//Exception 
#include <iostream>

using namespace std; 

int main()
{
    try
    {
        throw 20;
    }
    catch(int  e)
    {
        cout<< "Una excepcion ocurrio Numero: "<<e << endl;;
    }
    
}