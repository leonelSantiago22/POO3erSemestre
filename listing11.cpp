#include <iostream>

using namespace std;

template <class T> // Plantilla Cuando las operaciones son identicas pero requieren diferentes tipos de datos

void desplegarArr(T arr[], const int cont, T pr)
{
    for (int i = 0; i < cont; i++)
    {
        cout <<arr[i] << " " <<endl;
    }
    cout << endl;
    cout << pr << endl;
}

int main()
{
    const int contEnt = 4, contFlot = 5, contCar = 10; //Definimos los valores constantes 

    int ent [] = {1,2,3,4}; //Areglo de numeros 
    float flot [] = {1.1, 2.2, 3.3, 4.4, 5.5}; //Arreglo de numeros flotantes 
    char car []= {"Plantilla"};


    cout << "Arreglo de flotantes: \n";
    desplegarArr(flot, contFlot, (float)3.33);
    cout << "Arreglo de caracteres:\n";
    desplegarArr(car, contCar, 'Z'); // Mandamos para imprimir el arreglo en la funcion desplegar
    cout <<"Arreglo de enteros:\n";
    desplegarArr(ent, contEnt, 99);

    return 0;
}