//Programa de ejemplo de sobrecarga de operadores 
class Punto 
{
    float x,y;
    public:
        Punto ( float xx=0, float yy=0) 
        {
            x = xx; 
            y = yy;
        }
        float magnitude();
        Punto operator = (Punto);
        Punto operator +(Punto);
        Punto operator -();
        Punto operator *(float);
        Punto operator *=(float);
        Punto operator ++(); //Prefijo 
        Punto operator ++(int); //Posfijo
        int operator >(Punto);
        int operator <=(Punto);
};

Punto Punto::operator = (Punto a)
{
    x = a.x;
    y = a.y;
    return *this;
}

Punto Punto::operator +(Punto p)
{
    return Punto(x+p.x, y+p.y);
}
Punto Punto::operator -()
{
    return Punto(-x, -y);
}
Punto Punto::operator *(float f)
{
    Punto temp;
    temp = Punto(x*f, y*f);
    return temp;
}
Punto Punto::operator ++() // Incremento prefijo
{
    x++;
    y++;
    return *this;
}
Punto Punto::operator++(int)
{
    Punto tem = *this;
    x++;
    y++;
    return tem;
}
int Punto::operator>(Punto p)
{
    return (x>p.x && y>p.y) ? 1 : 0 ;
}
int Punto::operator <=(Punto p)
{
    return (x<=p.x && y<=p.y) ? 1 : 0 ;
}
int main()
{
    Punto a(1,1);
    Punto b; 
    Punto c; 
    b++;
    ++b;
    c = b;
    c = a+b;
    c =-a;
    c =-a;
    c = a*.5;

    return 0;
}