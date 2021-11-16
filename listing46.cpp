//Prueba de miembros estaticos
#include <iostream>
#include <stdio.h>
#include <string.h>

using namespace std;


class Persona{
        private:
            static int nPersonas;
            static const int MAX; //
            char *nombre;
        public:
        Persona(const char *c=NULL)//Metodo contructor 
        {
            if (c!=NULL)
            {
                nombre = new char[strlen(c) + 1];
                strcpy(nombre, c);
                cout <<"Persona : " << nombre << endl;
            }else{
                nombre=NULL;
                cout <<"Persona : " << endl;
            }
            nPersonas ++;
        }
        ~Persona()
        {
            cout <<"Eliminando persona: "<<nombre << endl;
            if (nombre)
            {
                delete[] nombre;
            }
            nPersonas--;
        }

        static int getMax()
        {
            return MAX;
        }
        static int getPersonas()
        {
            return nPersonas;
        }
};
int Persona::nPersonas= 0;
const int Persona::MAX=10;
int main()
{
    cout << "Maximo de personas: "<<Persona::getMax()<<endl;
    cout <<"Numero de Persona : " <<Persona::getPersonas()<<endl;

    Persona per1;
    cout <<"MAximo de personas:"<<Persona::getMax()<<endl;
    cout <<"Numero de personas:"<<Persona::getPersonas()<<endl;

    Persona per2("Persona 2");
    cout <<"MAximo de personas:"<<per2.getMax()<<endl;
    cout <<"Numero de personas:"<<per2.getPersonas()<<endl;
    return 0;
}