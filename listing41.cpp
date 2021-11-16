#include <iostream>

using namespace std;

int cuadrado(int i)
{
    return i*i;
}

double cuadrado(double d)
{
    return d*d;
}

int main()
{
    cout << "10 elevado al cuadrado :"<<cuadrado(10)<<endl;
    cout << "10.5 elevado al cuadrado :"<<cuadrado(10.5)<<endl;
    return 0;
}