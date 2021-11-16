#include <iostream>

using namespace std;

template<class T>
T mayor(T x, T y) 
{
    return (x>y) ? x: y ;
};

int main()
{
    int a = 10, b = 20, c =0 ;
    float x =44.1, y = 22.3, z =0 ; //

    c = mayor(a,b);
    z = mayor(x,y);
    cout <<c<<" "<<z<<endl;


    return 0;
}
/*Esto de "<>" se utiliza como un define en C++, las definiciones de plantilla se escriben con la palabra clave 
template con una lista de parametros formales entre <>*/
