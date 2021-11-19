//Sobre carga de operadores. Implementacion de una clase String
#include <iostream>
#include <stdio.h>
#include <string.h>

using namespace std; 

class String 
{
    //operadores de salida de flujo
    friend ostream &operator << (ostream &, const String &);
    private:
        char *s;
        int tam;
    public : 
        String (const char * = NULL);
        String(const String &copia)
        {
            s= NULL;
            tam =0;
            *this = copia; //Se vale o no ?  
        }
        ~String()
        {
            if (s!=NULL)
            {
                delete []s;
                s = NULL;
                tam=0;
            }
        }
        //Sobre carga de contructor de asignacion
        const String &operator = (const String &);
        //igualdad 
        int operator==(const String &) const;
        //concatenacion 
        String operator + (const String &) const;
        //concacatenacion y asignacion 
        const String &operator+=(const String &);
        String &copia (const String &);
        //Sobre carga de los corchetes 
        char &operator[](int) const;
};
//Operadores de intersecion y extraccion de flujo 
ostream& operator<<(ostream &salida, const String &cad)//Salida permite el ostream
{
    salida<<cad.s;
    return salida;
}

istream &operator>> (istream &entrada, String &cad)
{
    char tmp[100];
    entrada>>tmp;
    cad = tmp; //usa operador de asignacion de String y const. de conversion
    return entrada; //permite concatenacion
}

String::String(const char *c)
{
    if (c==NULL)
    {
        s = NULL;
        tam =0;
    }else{
        tam = strlen(c);
        s = new char[tam+1];
        strcpy(s,c);
    }
}

const String &String::operator=(const String &c)
{
    if (this!= &c)
    {
        if (s!=NULL)
        {
            delete []s;
        }
        tam = c.tam;
        s = new char [ tam +1];
        strcpy(s, c.s);
    }
    return *this; //Permite concatenacion de asignaciones 
}

int String::operator==(const String &c) const
{
    return strcmp(s, c.s) ==0;
}

//operador de suma regresa una copua de la suma obtenida 
//En un objeto local 
String String::operator +(const String &c) const
{
    String tmp(*this);
    tmp+=c;
    return tmp;
}

const String &String::operator+=(const String &c)
{
    char *str= s, *ctmp = new char [c.tam+1];
    strcpy(ctmp, c.s);
    tam += c.tam;
    s = new char [tam+1];
    strcpy(s, str);
    strcat(s, ctmp);
    delete []str;
    delete []ctmp;
    return *this;
}

String &String::copia (const String &c)
{
    if (this!=NULL)
    {
        if (s!=NULL)
        {
            delete []s;
        }
        tam = c.tam;
        s = new char [tam+1];
        strcpy(s, c.s);
    }
    return *this; //permite concatenacion de asignaciones 
}

char &String::operator[](int i) const
{
    if (i>=0 && i<tam)
    {
        return s[i];
    }
    return s[0];
}

int main()
{
    String a("AAA");
    String b("Prueba de cadena");
    String c(b);
    //Es un error hacer una asignacion sin liberar memoria 
    //Ese es el principal peligro de usar el operador de sobre carga 
    //Por default de asignacion
    a =b;
    b.copia(" H O L A ");
    b = c+c;
    b = "nueva";
    c+=c;
    String d("Nueva cadena");
    d+="Hola";
    String e;
    e = d+"Adios";
    d = "coche";
    int x = 0;
    x = d=="coche";//lo contrario no es valido "coche"==d
    char ch;
    ch = d[7];
    d[2]= 'X';
    cout<<d<<endl;
    cout<<"introduce dos cadenas: ";
    cin>>e>>d;
    cout<<"cadenas: \n";
    cout<<e<<endl<<d;
    return 0;
}