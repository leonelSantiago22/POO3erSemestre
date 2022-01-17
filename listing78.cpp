//ejemplo de funciones virtuales 

#include <iostream>
using namespace std; 

class base {
    public:
        virtual void quien(){
            cout<<"Base \n";
        }
};

class primera: public base {
    public:
        void quien()
        {
            cout<<"primera\n";
        }
};

class segunda: public base {
    public:
        void quien()
        {
            cout<<"Segunda\n";
        }
};

class tercera: public base 
{

};

class cuarta: public base {

};

int main()
{
    base objBase, *pBase; 
    primera obj1;
    segunda obj2;
    tercera obj3;
    cuarta obj4;

    pBase = &objBase;
    pBase->quien();
    //imprimere el mensaje de Base 

    pBase = &obj1;
    pBase->quien();
    //imprime el mensaje primera 

    pBase = &obj2;
    pBase->quien();
    //imprime el mensaje de segunda 

    pBase=&obj3;
    pBase->quien();
    //sigue imprimiendo el mensaje de segunda 

    pBase = &obj4;
    pBase->quien();
    //sigue imprimiendo el mensaje de segunda  

    return 0;

}