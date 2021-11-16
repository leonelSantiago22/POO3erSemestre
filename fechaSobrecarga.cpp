//Codigo de ejemplo de uso de las clases 10/28/2021
/*ES posible tener el mismo nombre para una operacion con la condiion de qie tenga paramtros diferentes. 
LA difrencia debe ser al menos en el tipo de datos. Al menos un parametro debe ser diferentes */
#include <iostream>

using namespace std;

class Fecha {
    private:
        int dia; 
        int mes; 
        int an;
    public:
        bool setDia(int);
        int getDia();
        bool setMes(int);
        int getMes();
        bool setAn(int);
        int getAn();
};


int main()
{
    int dia,mes,an;

    cout << "Ingresa el dia a validar";
    cin >> dia;
    cout << "\nIngresa el mes:";
    cin>>mes;
    cout << "\nIngresa el anio:";
    cin>>an;
    Fecha *p;
    p = new Fecha;
    p->setDia(dia);
    p->setMes(mes);
    p->setAn(an);

    cout << "LA fecha "<<p->getMes<<p->getAn<<p->getDia<<"es correctamente";
}

bool Fecha::setdia(int d) 
{
        if (d<=31)
        {
            dia = d; 
            return true;
        }else{
            cout << "La fecha no ah sido aceptada"; 
            return false;
        }
}

bool Fecha::setMes(int m)
{
    if (m<=12)
    {
        mes = m; 
        return true;
    }else{
        cout << "La fecha no ah sido aceptada"; 
        return false;
    }
}

bool Fecha::setAn(int a) 
{
    if (a <= 2022)
    {
        an= a;
        cout << "Fecha aceptada" << endl;
    }else{
        cout << "La fecha no ah sido aceptada" << endl;
        return false;
    }
    
}

int Fecha::getDia()
{
    return dia;
}
int Fecha::getMes()
{
    return mes;
}
int Fecha::getAn()
{
    return an;
}