//acceso por herencia 
#include <iostream>
using namespace std; 

class X
{
    protected:
    int i; 
    int j; 
    public:
    void preg_ij();
    void pon_ij();
};

void X::preg_ij()
{
    cout<<"Escriba dos numeros :";
    cin>>i>>j;
}

void X::pon_ij()
{
    cout <<i<<' '<<j<<endl;
}

// en Y, i y j de X siguen siendo miembros protegidos 
//si se llegara a cambiar este acceso a provate i y j se heredaria como miembros privados de Y, ademas de los metodos publicos 
class Y: public X
{
    int k;
    public:
        int preg_k();
        void hacer_k();
};
int Y::preg_k()
{
    return k;
}
void Y::hacer_k()
{
    k = i*j;
}
//Z tiene acceso a i y j de X, pero no a k de Y
//por que es provate por omision 
//Si  Y heredara de X como provate, i y j serian privados en Y, 
//por lo que no podrian ser accesados desde Z 

class Z:: public Y{
    public:
        void f();
};

//Si Y heredara a X con private, este metodo ya no funcionaria 
//no se podria accede a i ni a j
void Z::f()
{
    i =2;
    j =3;
}
//si Y hereda de X como provate, no es posible accesar a los metodos 
//publicos desde objetos de Y ni de Z 
int main()
{
    Y var;
    Z var2;
    var.preg_ij();
    var.pon_ij();
    var.hacer_k();
    cout<<var.preg_k()<<endl;
    var2.f();
    var2.pon_ij();
    return 0;
}