//10/08/2021 clase de programacion estructurada: Diseno del salon para el codigo 
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int pila(Pila *pila, int tam);

typedef struct
{
    int *pila;
    int tope;
    int tam;
}Pila;

int main()
{

}

int pila(Pila *pila, int tam)
{
    pila->pila = (int *) malloc(sizeof(int)*tam);
    if (pila->pila == 0)
    {
        return 0;
    }else{
        pila->tam = tam;
        pila->tope = -1;
        return 1;
    }
    
}
int estavacia(Pila *p)
{
    return 0;
}

int peek(Pila *pila)
{
    if (estavacia(pila))
    {
        return 0;
    }
    return pila->pila[pila->tope];
}

int tope (Pila *pila)
{
    return pila->tope;
}

int push(Pila *pila, int valor)
{
    if (estallena(pila))
    {
        pila->pila = valor;
        return 1;
    }
    return 0;
    
}