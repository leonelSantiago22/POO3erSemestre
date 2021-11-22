//Problema de herencia 
//Mecanismo potente de abstraccion que permite compartir similitudes entre clases mateniendo al mismo tiempo sus diferencias 
//Private no se puede usar en la clase herencia
#include <iostream>

using namespace std;

class Vehiculo 
{
    int ruedas;
    int pasajeros; 
    public:
    void setRuedas(int);
    int getRuedas();
    void setPasajeros(int);
    int getPasajeros();
};

void Vehiculo::setRuedas(int num)
{
   ruedas = num;
}
int Vehiculo::getRuedas()
{
    return ruedas;
}
void Vehiculo::setPasajeros(int num)
{
    pasajeros = num;
}
int Vehiculo::getPasajeros()
{
    return pasajeros;
}

//clase caminon con herencia de Vehiculo 
class Camion: public Vehiculo
{
    int carga;
    public:
    void setCarga(int);
    int getCarga();
    void muestra();
};

void Camion::setCarga(int num)
{
    carga = num;
}
int Camion::getCarga()
{
    return carga;
}
void Camion::muestra()
{
    cout<<"Ruedas: "<<getRuedas()<<endl;
    cout<<"Pasajeros: "<<getPasajeros()<<endl;
    cout<<"Capacidad de carga:"<<getCarga()<<endl;
}

int main()
{
    Camion ford;
    ford.setRuedas(6);
    ford.setPasajeros(3);
    ford.setCarga(3200);
    ford.muestra();
    return 0;
}
