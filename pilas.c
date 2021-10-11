#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
typedef struct pilas pila;
pila* crearpila(int tam);
int peek(pila *pi);
int estallena(pila *pi);
int estavacia(pila *pi);
void finpila(pila *pi);
void push(pila *pi, int item);
int pop(pila *pi);
//void push();
struct pilas
{
    int tam; 
    int tope;
    int *pila;
};

pila* crearpila(int tam)
{
    pila *pi = (pila *) malloc(sizeof(pila));//Creamos el espacio de memoria para la pila. 
    pi->tam = tam;
    pi->tope = -1;//Asignamos como primer parametro para tope -1.
    pi->pila = (int *) malloc(pi->tam * sizeof(int)); // Creamos el espacio de los datos en la pila.
    return pi;
}

int main()
{
    int tam;
    printf("Ingresa : ");
    scanf("%d", &tam);
    pila *pi  =  crearpila(tam);
    for (int i = 1; i <= tam; i++) //Llenado de numeros que estaran en la pila 
    {
       push(pi, i);
    }
    printf("\nElementos actuales\n");
    for (int i = pi->tope; i >= 0; i--) //Mostrar los elementos que estan en la pila 
    {
        printf("\n%d", pi->pila[i]);
    }
    int item = peek(pi); //Elemento que esta en la cima
    if(item == INT_MIN)
        printf("\nNo hay elementos en la pila");
    else
        printf("\nelemento de la cima : %d", item);    


    int it = pop(pi);
        if(it != INT_MIN);
            printf("elemento retirado de la pila %d", it);
    printf("Elementos despues de borrar el top");
    for (int i = pi->tope; i >= 0; i--) //Mostrar los elementos que estan en la pila 
    {
        printf("\n%d", pi->pila[i]);
    }
    finpila(pi);
    
}

int peek(pila *pi) 
{
    if(estavacia(pi))
        return INT_MIN;
    return (pi->pila[pi->tope]);    
}

int estallena(pila *pi) // Verificar si esta llena la pila dependiendo del tamano 
{
    return  pi->tope == (int) pi->tam-1;
}
int estavacia(pila *pi) // Saber si nuestra pila esta vacia 
{
    return pi->tope == -1;
}

void finpila(pila *pi)
{
   free(pi->pila);
   free(pi);
}

void push(pila *pi, int item) // Mandar los elementos hacia la pila 
{
    if(estallena(pi))
    {
        printf("\nError de desbordamiento");
    }else {
         pi->pila[++pi->tope] = item;
    }
}
int pop (pila *pi) // Eliminar el elemento tope 
{
    if(estavacia(pi))
    {
        printf("\nError de desbordamiento");
        return INT_MIN;
    }else{
        return pi->pila[pi->tope--];
    }
}