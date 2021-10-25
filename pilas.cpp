#include <iostream>

using namespace std;
//typedef struct PILA pila;

typedef struct{
    int tam; 
    int tope;
    int *pila;
}PILA;

PILA* crearpila(PILA *pila, int tam);
int peek(PILA *pi);
int estallena(PILA *pi);
int estavacia(PILA *pi);
void finpila(PILA *pi);
void push(PILA *pi, int item);
int pop(PILA *pi);


int main()
{
    int tam;
    cout <<"Ingresa el tamano de la pila ";
    cin >> tam;
    PILA *pi = crearpila(pi, tam );
    for (int  i = 1; i <=tam; i++)
    {
        push(pi,i);
    }
    cout <<"elementos actuales en la pila "<<endl;
    for (int  i = pi->tope; i >=0; i--)
    {
        cout <<"\n"<<pi->pila[i];
    }
    cout <<"\n\nElemento en la punta "<<endl;
    int item = peek(pi);
    cout <<" "<<item<<endl;
    int it = pop(pi);
    cout <<"Elemento borrado de la punta "<<it<<endl;
    cout <<"Elementoss despues de borrar la punta\n\n"<<endl;
    for (int i = pi->tope; i >=0; i--)
    {
        cout <<"\n"<<pi->pila[i];
    }
    


}

PILA* crearpila(PILA *pila, int tam)
{
    pila = new PILA;
    pila->pila = new int;
    pila->tope = tam;
    pila->tope = -1;
    return pila;
}


void push(PILA *pi, int item)
{
    pi->pila[++pi->tope] = item;
}

int estallena(PILA *pi) // Verificar si esta llena la pila dependiendo del tamano 
{
    return  pi->tope == (int) pi->tam-1;
}

int estavacia(PILA *pi) // Saber si nuestra pila esta vacia 
{
    return pi->tope == -1;
}

int peek(PILA *pi)
{
     return (pi->pila[pi->tope]); 
}
int pop(PILA *pi)
{
return pi->pila[pi->tope--];
}
