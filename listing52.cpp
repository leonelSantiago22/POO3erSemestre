//Ejemplo de funcion amiga con accesso a miembros privados  
#include <iostream>

using namespace std;

class ClaseX{
    friend void setX(ClaseX &, int);
    public:
    ClaseX()
    {
        x = 0; //
    }

    void print () const{
        cout <<x<<endl;
    }
    private: 
    int x;
};

void setX(ClaseX &c, int val) 
{
    c.x = val;
}

int main()
{
    ClaseX pr; 
    cout <<"pr.x despues de instanciacion: ";
    pr.print();
    cout <<"pr.x despues de la llamada a la funcion amiga setX: ";
    setX(pr, 10);
    pr.print();
}