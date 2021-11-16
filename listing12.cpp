#include <iostream>
using namespace std;

template<class T, class TT>

T mayor ( T x, TT y ) 
{
    return (x>y) ? x : y; //? es un condicional al igual que :
}

int main() 
{
    int a = 10, b = 20, c =0;
    float x = 44.1, y = 22.3, z= 0;

    c = mayor(a, b); //SAber si a es mayor que b
    z = mayor(x , y); // SAber si x es mayor que y 

    cout <<c<<" "<<z<<endl; 
//Sin error al aumentar un parametro formal 
    z = mayor(x,b);
    cout << z<<endl; 
    x = mayor(a,y); // Regresa enteror pues a es entero (tipo T es un enterp para 
    cout<<" "<<z<<endl; //este llamado


    z = mayor(y,a);
    cout << z<<endl;
    c = mayor(y,a); // Regresa flotante pero la asignacion lo corta a entero
    cout<<" "<<c<<endl; 


    return 0;
}