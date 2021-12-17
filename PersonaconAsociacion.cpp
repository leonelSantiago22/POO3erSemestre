//Prestaod--Alumno--Libro
//Devolucion --Libro--Alumno
//Borrar libro 
//Borrar Alumno
#include<iostream>
using namespace std;
class Alumno {
    protected:
    int matricula;
    int grupo;
    char *nombre;
    Libro *lPrestado[3];
    public:
    friend ostream& operator<<(ostream& op,  Alumno& os);
    Alumno(){
        matricula = 0;
        grupo = 0;
        nombre = NULL;
        for (int i = 0; i < 3; i++)
        {
            lPrestado[i] = NULL;
        }
        
    }
    void setMatricula(int _m){
        if(_m>0){
            matricula = _m;
        }else
            return;
    }
    void setGrupo(int _g){
        if (_g>0&&_g<100)
            grupo = _g;
        else 
            return;
    }
    void setNombre(char *_n)
    {
        if(_n!=NULL)
            nombre = _n;
        else
            return;
    }
    void setLibros(Libro _l)
    {
        int i =0;
        while (lPestado[i]!=NULL)
        {
            i++;
        }
        lPrestado[i] = _l;
    }
    int getMatricula(){return matricula;}
    int getGrupo(){return grupo;}
    char * getNombre(){return nombre;}

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
ostream& operator<<(ostream& op,  Alumno& os)
{
    op<<os.getMatricula()<<os.getNombre()<<os.getGrupo();
}
class Libro{
    private:
    char *Editorial;
    int edicion;
    int anio;
    Alumno *aPrestado;
    public:
    void setEditorial(char *_e){
        if(_e!=NULL)
            Editorial = _e;
        else 
            return;
    }
    void setEdicion (int _ed){
        if(_ed>0)
            edicion = _ed;
        else
            return;
    }
    void setAnio(int _a)
    {
        if (_a>0 && _a<9999)
            anio = _a;  
        else
            return;
    }
    void setaPrestado(Alumno *Al)
    {
        if (Al!=NULL)
        {
            aPrestado = Al;
        }else{
            return;
        }
        
    }

};

int main()
{
    Alumno al; 
    al.setGrupo(102);
    al.setMatricula(10);
    al.setNombre((char *)"Leonel");
    cout<<al;
}