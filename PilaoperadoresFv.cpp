/*
Crear un programa con clase Pila y los metodos correspondientes (push, pop, getTope, getEmeTope, Estavacia, Estallena)
Ocupando los temas OO antes vistos de acuerdo a lo de cada lenguaje permite 
(contructores, miembros estaticos, 
sobre carga de operaciones, sobre carga de operadores //Son los 2 faltantes
 funciones amigas)
*/

#include <iostream>
#include <string.h>
using namespace std;

class Pila { 
    friend void prueba(Pila &, int);
    private:
        int *pila;
        int tam;
        static const int MAX;//Miembros constantes
        int tope;
    public:
        bool iniPila(int t);
        bool push(int tam);
        Pila operator + (int);
        int pop();
        void display();
        void finpila();
        int estallena();
        int estavacia();
        void peek();
        
        ~Pila(){//Destructor
            if (pila!=NULL)
            {
                delete [] pila;
                tam = 0; 
                tope = -1;
            }
        }
};
const int Pila::MAX = Pila::tam;
void prueba(Pila &c, int val)
{
    c.tam = val;
}
Pila Pila::operator + (int n) //Utilizamos ahora esto como si fuera nuestro push.
{
    return Pila(pila+n.pila);
    
}

//#include "Pila.h"

//using namespace std;

int main() 
{
    Pila p, *a, c;
    int tam;
    cout <<"Ingresa el tam\t:";
    cin >> tam; 
    prueba(p, tam);//Se manda a llamar la clase amigo
    p.iniPila(tam);
    a = new Pila;
    a->iniPila(tam);
    for (int i = 1; i <= tam; i++)
    {
        a->push(i);
        c+i;
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

bool Pila::iniPila(int t)//:: operacion de resolucion de alcance //Contructor
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
    return false;
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