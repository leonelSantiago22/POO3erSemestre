#include <iostream>
using namespace std;

namespace ns1
{
    int valor() { return 5;}
}

namespace ns2
{
    const double x = 100; 
    double valor() { return 2*x;}
}

int main()
{
    cout <<ns1::valor() <<'\n'; //:: operador de resolcion de alcance 
    cout <<ns2::valor() <<'\n'; //
    cout <<ns2::x << '\n';
}