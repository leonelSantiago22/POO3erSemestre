//cola definica en un arreglo 
//incluye constructores y destructores a

#include <iostream>
#include <string.h>
#include <stdio.h>

using namespace std;

class Cola{
    private:
        int q[10], sloc, rloc;
        char *nom;
    public:
        Cola (const char *cad=NULL)//Funcion en linea//Contructor
        {
            if (cad)
            {
                nom = new char[strlen(cad)+1];
                strcpy(nom, cad);
            }else{
                nom = NULL;
            }
            sloc = rloc = -1;
        }
        ~Cola( ){//Destructor de la cola
            if (nom)//nom!=NULL
            {
                cout << "Cola:"<<nom<<"destruida\n";
                delete [] nom;
            }
            
        }
        char set(int);
        int get();
};

char Cola::set(int val)
{
    if (sloc>=10)
    {
        cout << "LA cola esta llena";
        return 0; //
    }
    sloc++;
    q[sloc] = val;
    return 1;
    
}

int Cola::get()
{
    if (rloc==sloc)
    {
        cout << "La cola esta vacia";
    }else{
        rloc++;
        return q[rloc];
    }
    return 0;
    
}

int main()
{
    Cola a("Cola a   "), b("Cola b    "), 
            *pCola = new Cola ("Cola dinamica pCola    ");

    a.set(1);
    b.set(2);
    pCola ->set(3);
    a.set(11);
    b.set(22);
    pCola->set(33);
    cout <<a.get() <<endl;
    cout <<a.get() <<endl;
    cout <<b.get() <<endl;
    cout <<b.get() <<endl;
    cout <<pCola->get() <<endl;
    cout <<pCola->get() <<endl;


    delete pCola;
}