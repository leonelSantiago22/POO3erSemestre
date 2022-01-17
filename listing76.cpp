#include <iostream>
#include <string.h>

using namespace std;
class Nombre {
    char *nombre, *paterno, *materno;
    public:
        Nombre(char *n, chat *p, char *m){
            nombre = new char[sterlen(n)+1];
            paterno = new char[strlen(p)+1];
            materno = new char [strlen(m)+1];
            strcpy(nombre , n);
            strcpy(paterno, p);
            strcpy(materno, n);
        }
        ~Nombre()
        {
            cout<<"destructor de Nombre: "<<nombre<<endl;
            delete []nombre;
            delete []paterno;
            delete []materno;
        }
};

class Persona {
    Nombre miNombre; 
    int Edad;
    public:
        Persona(char *n, char *p, char *m): miNombre(n,p,m)
        {
            edad = 0;
        }
};

int main()
{
    Persona *per1;
    per1 = new Persona("uno", "dos", "tres");
    Persona per2("Bod", "the", "Builder");
    delete per1; 
    return 0;
}