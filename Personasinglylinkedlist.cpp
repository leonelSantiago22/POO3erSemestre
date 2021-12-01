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
        Persona * setPersona(Persona *);
        Nodo * setSig();
        Nodo *getSig();
        Node* create_node(Persona *);
        Nodo(){
            sig = NULL;
        }
        ~Nodo(){
            if (sig!=NULL)
            {
                sig = NULL;
            }
            
        }
};
Nodo * Nodo::getSig()
{
    return sig;
}
Persona * Nodo::setPersona(Persona *item)
{
    if (item!=NULL)
    {
        per = item;
        return per;
    }else{
        cout<<"No se puede continuar"<<endl;
    }
    
}
Nodo * Nodo::setSig()
{
    sig = NULL;
    return sig;
}
Nodo* Nodo::create_node(Persona *item)
{
    Nodo *new_node = (Node *) malloc (sizeof(Node));
    new_node = new_node->setPersona(item);
    new_node = new_node.setSig();
    return new_node;
}
class lista{
    protected:
    Nodo *head;
    public:
        lista(head)//Contructor de la clase lista 
        {
            heead = NULL;
        }
        lista* create_slinked_list();
        void insert_head(Nodo **, Persona *);
        void insert_end(Nodo **, Persona *);
        ~lista()
        {
            if (head!=NULL)
            {
                head = NULL;
                delete [] head;
            }
            
        }
};
void lista::insert_head(Nodo **ref, Persona *per)
{
    Nodo *new_node = Nodo::create_node(per);
    new_node = Nodo::setSig(*ref) = (*ref);
    (*ref) = new_node;
}
void lista::insert_end(Nodo **ref, Persona *per)
{
    if ((*ref)== NULL)//Valida que no estamos agregando por primera vez  si si lo mandamos a la validacion del insertar al inicio
    {
        insert_head(ref, item);
        return;
    }
    Nodo *new_node = Nodo::create_node(per);
    Nodo *last = *ref;
    while (last->getSig() != NULL)
    {
        last = last->getSig();
    }
    last->sig = new_node;
}
lista * lista::create_slinked_list()
{
    lista *l = (lista *) malloc (sizeof(lista));
    l->head = NULL;
    return lista;
}
class Persona{
    protected:
        char *nombre;
    public:
        Persona(char *no)
        {
            nombre = no;
        }
        ~Persona()
        {
            if (nombre != NULL)
            {
                nombre = NULL;
            }
            
        }
};