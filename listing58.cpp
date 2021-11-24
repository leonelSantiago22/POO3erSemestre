//Ejemplo de control de Acceso a miembros en C++
#include <iostream>
class S
{
    char *f1();
    int a;
    protected:
    int b;
    int f2();
    private:
    int c;
    int f3();
    public:
    int d,f;
    char *f4(int);
};

int main()
{
    S obj;
    obj.f1(); //error
    obj.a = 1; //error
    obj.f2(); //error
    obj.b = 2; //error
    obj.c = 3; //error
    obj.f3(); //error
    obj.d = 5;
    obj.f4(obj.f);
    return 0;
}