/*Ejemplo assert*#pragma endregion*/
#include<stdio.h>
#include<assert.h>

void print_numbre(int *myInt)
{
    assert(myInt != NULL);
    printf("%d\n", *myInt);
}

int main()
{
    int  a = 10;
    int * b = NULL;
    int * c = NULL;

    b = &a;

    print_numbre(b); //correcto
    print_numbre(c); //incorrecto

    return 0;
}