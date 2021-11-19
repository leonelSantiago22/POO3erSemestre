#include <iostream>
#include <stdio.h>
#include <string.h>
class String
{
    char *s;
    int tam;
    public:
        String(const char *st)
        {
            if(st != NULL)
            {
                int e = strlen(st);
                s = new char[e+1];
                tam = e;
                strcpy(s, st);
            }else
            {
                s = 0; 
                tam = 0;
            }
        }
        String(const String &copia) // Contructor de copia 
        {
            s = NULL; 
            tam = 0;
            copia = *this; //
        }
         
        //Sobrecarha de operador de asignacion
        const String &operator=(const String &);
        //igualdad
        int operator == (const String &) const;
        //Desigualdad 
        int operator != (const String &) const;
        //Menor que  
        int operator < (const String &) const;
        //mayor que 
        int operator > (const String &) const;
        //menor o igual que 
        int operator <= (const String &) const;
        //mayor o igual que 
        int operator >= (const String &) const;
        //concateacion
        String operator + (const String &) const;
        //Concatenacion y asignacion
        const String operator +=(const String &) const;
        //Sobre carga de los corchetes
        char &operator [] (int ) const;
        ~String()// Destructor
        {
            if (s!=NULL)
            {
                delete []s;
                s = NULL;
                tam = -1;
            }
            
        }
};
//Concatenacion
 int String::operator == (const String &va) const
    {
        return strcmp(s, va.s) == 0;
    }
        //Desigualdad 
String String::operator + (const String &c) const
{
    String tmp(*this);
    tmp +=c;
    return tmp;
}
const String String::operator +=(const String &c) const
{
    String tmp(*this);
    tmp +=c;
    tmp = tmp;
    return tmp;
}

int  String::operator< (const String &va) const
{
    return strcmp(s, va.s) < 0;
}
int String::operator>(const String &va) const
{
    return strcmp(s, va.s) > 0;
}
int String::operator<=(const String &va) const
{
    return strcmp(s, va.s) <= 0;
}
int String::operator >= (const String &va) const
{
    return strcmp(s, va.s)>=0;
}
int String::operator != ( const String &va) const
{
    return strcmp(s, va.s) !=0;
}
char &String::operator [] (int x) const
{
    if (x>=0 && x<=tam)
    {
        return s[x];
    }
    return s[0];
    
}
const String &String::operator=(const String &c)
{
    if (this!=c)
    {
        if (s!=NULL)
        {
        delete []s;
        }
        tam = c.tam;
        s = new char[tam+1];
        strcpy(s, c.s);
    }
    return *this;
    
}
int main()
{
    String a("Prueba 1");
    String b("Prueba de la cadena");
    String c(b);
    a=b;
    b=c+c;
    c+=c;

    return 0;
}