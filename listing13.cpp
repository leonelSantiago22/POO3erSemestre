#include <iostream>

using namespace std;

enum Temporada { PRIMAVERA, VERANO, OTONO, INVIERNO};

int main()
{
    Temporada tem; 
    tem = PRIMAVERA;
    cout<<"Temporada: "<< tem<<endl;

    cout<<"Lista de temporada: ";
       int t; 
    for ( t = PRIMAVERA; t<=INVIERNO; t++)
    {
        cout<<"Temporada: "<< t<<endl;
    }
    return 0;
}