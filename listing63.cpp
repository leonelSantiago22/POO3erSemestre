#include<iostream>
#include <string.h>
#include <assert.h>
#include <iomanip>
using namespace std;

class Employee{
    public:
        Employee(const char*, const char*);
        void print() const;
        ~Employee();
    private:
        char *firstName; 
        char *lastName;
};

Employee::Employee(const char *first, const char *last)
{
    firstName = new char [ strlen(first)+1];
    assert(firstName != 0);
    strcpy(firstName, first);

    lastName = new char[ strlen(last)+1];
    assert(lastName != 0 );
    strcpy(lastName, last);
}

void Employee::print() const
{
    cout<<firstName<<' '<< lastName;
}

Employee::~Employee()
{
    delete [] firstName;
    delete [] lastName;
}

class HourlyWorker: public Employee{
    public:
        HourlyWorker(const char*, const char*, float, float );
        float getPay() const;
        void print() const;
    private:
        float wage;
        float hours; 
};

HourlyWorker::HourlyWorker(const char *first, const char *last, float initHours, float iniWage): Employee(first, last)
{
    hours = initHours;
    wage = iniWage;
}

float HourlyWorker::getPay() const{ return wage * hours;}

void HourlyWorker::print() const{
    cout<<"HourlyWorker::print()\n\n";
    Employee::print(); // lama a funcion de la clase base 
    cout<<" es un trabajador por hora con sueldo de "<<"$"<<setprecision(2)<<getPay()<<endl;
}

int main()
{
    HourlyWorker h("BOB", "Smith", 40.0, 7.50);
    h.print();
    return 0;
}