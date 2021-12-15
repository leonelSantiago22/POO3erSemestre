#include<iostream>

using namespace std;

class Alumno {
    protected:
    int matricula;
    int grupo;
    char *nombre;
    Libro *lPrestado[3];
    public:
    Alumno(int _matricula, int _grupo, char * _nombre){
        matricula = _matricula;
        grupo = _grupo;
        nombre = _nombre;
        lPrestado = NULL;
    }
    void setMatricula(int);
    void setGrupo(int);
    void setNombre(char *);
    int getMatricula();
    int getGrupo();
    char * getNombre();

    ~Alumno(){
        if (matricula>=0 && nombre!=NULL )
        {
            matricula = 0;
            grupo = 0;
            nombre = NULL;
            delete []nombre;
        }
        
    }
};

class Libro{
    public:
    char *Editorial;
    char *edicion;
    int anio;
    Alumno *aPrestado;
};

int main()
{

}