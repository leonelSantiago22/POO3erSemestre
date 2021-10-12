#include <iostream>

using namespace std;

int porValor(int);
void porApuntador(int *);
void porReferencia( int &);

int main()
{
    int x =2;

    cout <<"x= "<< x << "Antes de llamada a por Valor \n"
                    <<"Regresado por la funcion: "<< porValor(x)<<endl
                    <<"x= "<<x <<"despues de la llamada por valor \n\n"<<endl;

    int y =3;

    cout <<"y= "<< y <<"Antes de llamada a porApuntador\n";
    porApuntador(&y);
    cout<<"y= "<< y <<"Despues de la llamada por apuntador \n\n"<<endl;

    int z =4;
    cout <<"z= "<< z <<"antes de la llamada por porReferencia\n";
    porReferencia(z);
    cout<<"z= "<<z <<"Despues de la llamada a porReferencia\n\n";         
    return 0;
}

int porValor(int valor) 
{
    return valor *=valor; //Parametero no modificado
}
void porReferencia(int &r)
{
    r *=r; //Parametro modificado
}

void porApuntador(int *p)
{
    *p *= *p; //Parametro modificado
}