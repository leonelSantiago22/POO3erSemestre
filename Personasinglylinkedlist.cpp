#include <iostream>
#include <stdlib.h>
#include <limits.h>
#include <stdio.h>
class Nodo
{
    protected:
    Nodo *sig;
    Persona *per;
    public:
        Persona * getPersona();
        void  * setPersona(Persona *);
        void setSig(Persona *;
        Nodo *getSig();
        Nodo(Persona *_per, Nodo *_sig){
            per= _per;
            sig = _sig;
        }
        ~Nodo(){
            if (sig!=NULL)
            {
                sig = NULL;
            }
            
        }
};
void Nodo::setPersona(Persona *_per)
{
    per = _per;
}
Persona * Nodo::getPersona()
{
    return per;
}
void Nodo::setSig(Nodo *_siguiente)
{
    sig = _siguiente;
}
Nodo * Nodo::getSig()
{
    return sig;
}
class Lista{
    private:
        Nodo *head; 
    public:
        Lista()
        {
            head = NULL;
        }
        void inserHead(Persona *);
        void insertEnd(Persona *);
        void mostrar();
        ~Lista(){
            if(head!=NULL)
            {
                head = NULL;
            }
        }
};
void Lista::inserHead(Persona *_per)
{
    Nodo n(_per, head);
    head = n;
}
void Lista::insertEnd(Persona *_per)
{
    Nodo n(_per, null);
    if (head == null)
    {
        head = n;
    }else {
        Nodo *aux = head; 
        while (aux.getSig()!=NULL)
        {
            aux = aux.getSig();
        }
        aux.setSig(n); 
    }
    cout<<"Final";
    
}

class Persona 
{
    private:
    //int tope;
    char *nombre;
    int edad;
    public:
    Persona()//constructor
    {
        nombre = NULL;
        edad =0;
    }
    void setNombre(char *);
    char * getNombre();
    void setEdad(int);
    int getEdad();
    ~Persona(){//Destructor
        if (edad!=0)
        {
            delete [] nombre;
            edad = 0;
        }
        
    }
};

void Persona::setNombre(char *n)
{
    if (n!=NULL)
    {
        nombre = n;
    }
}
char * Persona::getNombre()
{
    return nombre;
}
void Persona::setEdad(int e)
{
    if (e>0 && e<140)
    {
        edad = e;
    }   
}
int Persona::getEdad()
{
    return edad;
}
///