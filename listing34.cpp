#include <iostream>

using namespace std;

class Ejemplo3 {
    public:
        int i; 
        int j; 
};

int main()
{
    Ejemplo3 e1; 
    Ejemplo3 e2; 
    e1.i =10; 
    e2.j = 20;

    e2.i =100;
    e2.j = 20 ;
    cout <<e1.i<<endl;
    cout <<e2.i<<endl;


    return 0;
}