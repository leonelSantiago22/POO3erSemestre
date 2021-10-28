#include <iostream>
using namespace std;

class Pila { 
    private:
        int *pila;
        int tam; 
        int tope;
    public:
        bool push(int tam);
        int pop();
        void display();
        void finpila();
        int estallena();
        int estavacia();
        void peek();
        bool iniPila(int t);
};



//#include "Pila.h"

//using namespace std;

int main() 
{
    Pila p, *a;
    int tam;
    cout <<"Ingresa el tam\t:";
    cin >> tam; 
    p.iniPila(tam);
    a = new Pila;
    a->iniPila(tam);
    for (int i = 1; i <= tam; i++)
    {
        a->push(i);
    }
    a->display();
    a->peek();
    cout <<"\nDespues de eliminar el tope"<<endl;
    a->pop();
    a->display();
    a->peek(); 
    a->finpila();
    delete a;
}

bool Pila::iniPila(int t)//:: operacion de resolucion de alcance 
{
    if (t>0)
    {
        tam = t;
        tope = -1; 
        pila = new int[t];
        return pila;
    }else 
    {
        return false;
    }
    
}

int Pila::pop()
{
    if (estavacia())
    {
        cout <<"La pila esta vacia"<<endl;
    }
    else{
    if (pila!=NULL)
    {
        return pila[tope--];
    }
    }
    
}

bool Pila::push(int item)
{
    if (estallena())
    {
        cout <<"Ya no queda mas espacio";
    }else{
    pila[++tope] = item;
    return true;
    }
}

void Pila::display()
{
    for (int i = tope; i>=0; i--)
    {
        cout <<"\n"<<pila[i];
    }
    
}

void Pila::finpila()
{
    tam =0 ;
    tope = -1 ;
    delete []pila;

}

int Pila::estavacia()
{
    return tope==-1;
}
int Pila::estallena()
{
    return tope == (int) tam -1;
}

void Pila::peek()
{
    cout <<"\nElemento de arriba de la pila "<<pila[tope];
}