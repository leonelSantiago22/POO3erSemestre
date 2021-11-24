#include<iostream>
using namespace std;
class Persona 
{
    protected:
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
class Alumno: public Persona
{
    protected:
    int matricula;
    public:
    Alumno()
    {
        matricula=0;
    }
    void setMatricula(int);
    int getMatricula();
    ~Alumno()
    {
        if (matricula != 0)
        {
            matricula = 0;
        }
        
    }
};

void Alumno::setMatricula(int m)
{
    if (m!=0)
    {
      matricula = m;  
    }
}
int Alumno::getMatricula()
{
    return matricula;
}
///
class lic: public Alumno{
    protected:
    int semestre;
    public:
    lic()
    {
        semestre=0;
    }
    void setSemestre(int );
    int getSemestre();
    ~lic()
    {
        if (semestre!=0)
        {
            semestre=0;
        }
        
    }
};

void lic::setSemestre(int s)
{
    if (s>0 && s <=10)
    {
        semestre =s;
    }   
}
int lic::getSemestre()
{
    return semestre;
}
///
class posgrado: public Alumno{
    protected: 
    int materias;
    public:
    posgrado()
    {
        materias=0;
    }
    void setMaterias(int);
    int getMaterias();
    ~posgrado()
    {
        if (materias!=0)
        {
            materias =0;
        }
        
    }
};

void posgrado::setMaterias(int ma)
{
    if (ma>0 && ma<6)
    {
        materias = ma;
    }
}

int posgrado::getMaterias()
{
    return materias;
}

//
class profesor: public Persona
{
    protected:
    int sueldo;
    public:
    profesor()
    {
        sueldo=0;
    }
    void setSueldo(int);
    int getSueldo();
    ~profesor()
    {
        if (sueldo!=0)
        {
            sueldo=0;
        }
        
    }
};

void profesor::setSueldo(int s)
{
    if (s>0 && s<100000)
    {
        sueldo = s;
    }
}
int profesor::getSueldo()
{
    return sueldo;
}

class administrativo: public Persona
{
    protected:
    char *departamento;
    public:
    administrativo()
    {
        departamento = NULL;
    }
    void setDepartamento(char *);
    char * getDepartamento();
    ~administrativo()
    {
        if (departamento!=NULL)
        {
            delete [] departamento;
            departamento = NULL;
        }
        
    }
};
void administrativo::setDepartamento(char *d)
{
    if (d != NULL)
    {
        departamento =d;
    }
}
char * administrativo::getDepartamento()
{
    return departamento;
}

int main()
{
    //Persona p;
    //Alumno a;
    lic l;
    posgrado pos;
    profesor pro;
    int matricula;
    l.setNombre((char *)"Leonel");
    l.setEdad(12);
    l.setMatricula(1233);
    l.setSemestre(3);
    cout<<"Alumno: "<<l.getNombre()<<"\tedad: "<<l.getEdad()<<"\tmatricula: "<<l.getMatricula()<<"\tsemestre:"<<l.getSemestre()<<endl;
    pos.setNombre((char *)"Agustin");
    pos.setEdad(23);
    pos.setMatricula(123);
    pos.setMaterias(4);
    cout<<"Alumno: "<<pos.getNombre()<<"\tedad: "<<pos.getEdad()<<"\tmatricula: "<<pos.getMatricula()<<"\tmaterias:"<<pos.getMaterias()<<endl;
    pro.setNombre((char *)"Jorge");
    pro.setEdad(40);
    pro.setSueldo(2312);
    cout<<"Profesor: "<<pro.getNombre()<<"\tEdad: "<<pro.getEdad()<<"\tsueldo:\t"<<pro.getSueldo()<<endl;
}