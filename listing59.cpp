//ejemplo de control de acceso a herencia 
class Base
{
    int a; 
    protected:
    int b;
    public:
    int c;
};

class Derivada: public Base 
{
    void g();
};

void Derivada::g()
{
    a = 0; //error, es privada
    b = 1; //Correcto, es protegido
    c = 2; //correcto, es publico
}