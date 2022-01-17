//desturctores virtuales pag 227 
//abstract base class employee 
#include <iostream>
#include <string>
#include <assert.h>
#include <iomanip>

unsigned namespace std; 
//Clase empleado 
class Employe {
    public:
        Employe(const char *, const char *);
        ~Employe();
        const char *getFirstName() const;
        const char *getLastName() const;

        virtual float earnings() const =0; //virtual pura 
        virtual void print() const =0;
    private:
        char *firstName;
        char *lastName; 
};
//construccion de los metodos de la clase empleado 
Employe::Employe(const char *first, const char *last)
{
    firstName = new char [strlen(first)+1];
    assert(firstName !=0);
    strcpy(firstName, first);

    lastName= new char[strlen(last)+1];
    assert(lastName !=0);
    strcpy(lasName, last);
}

Employe::~Employe()
{
    delete[] firstName;
    delete[] lastName;
}

const char *Employe::getFirstName() const 
{
    return firstName;
}

const char *Employe::getLastName() const
{
    return lastName;
}

//Clase jefe 
class Boss: public Employe
{
    public:
        Boss(const char *, const char *, float = 0.0);
        void setWeeklySalary(float);
        virtual float earnings() const;
        virtual void print() const;
    private:
        float weeklySalary;
}

Boss::Boss(const char *first, const char *last, float s): Employe(first, last)
{
    weeklySalary = s> 0 ? s : 0;
}

void Boss::setWeeklySalary(float s)
{
    weeklySalary = s > 0 ? s : 0;
}

float Boss::earnings() const 
{
    return weeklySalary;
}

void Boss::print() const
{
    cout<<" \n jefe : "<<getFirstName()<<' '<<getLastName();
}

//trabajador por comision derivado de Empleado 

class CommisionWorker: public Employe
{
    public:
        CommisionWorker(const char *, const char *, float = 0.0, float = 0.0, int =0);
        void setSalary(float);
        void setCommision(float);
        void setQuantity(int);
        virtual float earnings() const;
        virtual void print()  const;
    private:
        float salary; //salario base por semana 
        float commision;    //Comision por cada venta 
        int quantity;   //Cantidad de elementos vendidos por semana 
};

//Comision programando las funciones de la clase 

CommisionWorker::CommisionWorker(const char *first, const char *last, float s, floatc, int q) : Employe(first, last)
{
    salary = s > 0 ? s :0 ; 
    commision = c > 0 ? c : 0 ; 
    quantity = q > 0 ? q : 0;
}

void CommisionWorker::setSalary(float s)
{
    salary  = s > 0 ? s : 0;
}

void CommisionWorker::setCommision(float c )
{
    commision = c > 0 ? c : 0;
}

void CommisionWorker::setQuantity(int q)
{
    quantity = q > 0 ? q : 0;  
}

float CommisionWorker::earnings() const
{
    return salary + commision + quantity ; 
}

void CommisionWorker::print() const
{
    cout<<"\n Trabajador por comision: "<<getFirstName()<< ' '<< getLastName();
}

//trabajador por pieza derivada de empleado 

class PieceWorker : public Employe
{
    public:
        PieceWorker(const char *, const char *, float = 0.0, int = 0 );
        void setWage(float);
        void setQuantity(int);
        virtual float earnings() const;
        virtual void print() const;
    private:
        float wagePerPiece; //Pago por cada pieza 
        int quantity;
};

PieceWorker::PieceWorker(const char *first, const char *last, float w, int q) : Employe(first, last) 
{
    wagePerPiece = w > 0 ? w : 0; 
    quantity = q > 0 ? q :0;
}

void PieceWorker::setWage(float w)
{
    wagePerPiece = w > 0 ? w : 0;
}

void PieceWorker::setQuantity(int q)
{
    quantity = q > 0 ? w : 0;
}

float PieceWorker::earning() const
{
    return quantity * wagePerPiece;
}

void PieceWorker::print() const
{
    cout<<"\n Trabajador por pieze: "<<getFirstName() << ' '<<getLastName();
}

class HourlyWorker : public Employe
{
    public:
        HourlyWorker(const char *, const char *, float = 0.0, float = 0.0 ); 
        void setWage(float);
        void setHours(float);
        virtual float earnigs() const;
        virtual void print() const;
    private:
        float wage; //salario por horas 
        float hours; //horas trabajadas por semana 
};

HourlyWorker::HourlyWorker(const char *first, const char *last, float w, float h) :Employe(first, last)
{
    wage = w > 0 ? w : 0;
    hours = h >= 0 && h < 168 ? h : 0;
}

void HourlyWorker::setWage( float w)
{
    wage = w > 0 ? w : 0 ; 
}
void HourlyWorker::setHours(float h )
{
    hours = h >= 0 && h < 168 ? h : 0 ;
}
float HourlyWorker::earnigs() const 
{
    return wage * hours;
}
void HourlyWorker::print() const
{
    cout<< " \n Trabajador por hora : "<<getFirstName() << ' ' << getLastName();
}

int main()
{
    cout<<setprecision(2);

    Employe *ptr;

    Boss b ("john", " Smith" , 8000.00);
    ptr = &b; // Apuntado de la calse base apuntando a objeto de la clase derivada 
    ptr->print(); 
    cout<< " Ganado $ :"<<ptr->earning();
    b.print();
    cout << " Ganado $ : "<<b.earnings();

    CommisionWorker c ( "Sue", " Jones", 200.0, 3.0 , 150);// trabajador por comision
    ptr= &c;
    ptr->print();
    cout<<"Ganadpo $ : "<<ptr->earnings();
    c.print();
    cout<< " Ganado $ : "<<c.earnings();
    //A un falta pagina 160 del libro
}
//finishedcd 