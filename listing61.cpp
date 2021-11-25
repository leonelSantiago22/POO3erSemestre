//Se sacan los parametros de la derivada, es para manejar coleeciones de objetos de una gerarquia referenciado a una clase base 
//se pueden tener n instancias. Manejo de colecciones de objetos y de polimorfismo. 
//PINT.H
//clase point
#include <iostream>
#include <iomanip>
using namespace std;
//#ifdef POINT_H_
#define POINT_H_
class Point
{
    friend ostream &operator<<(ostream &, const Point &);
    public:
        Point(float=0, float=0);
        void setPoint(float, float);
        float getX() const {return x;}
        float getY() const {return y;}
    protected:
        float x,y;
};

//#endif//Terminamos de definir lo que hay en esta clase. 
//#include <iostream>
//#include "point.h"

Point::Point(float a, float b)
{
    x=a;
    y=b;
}
void Point::setPoint(float a, float b)
{
    x = a; 
    y = b;
}
ostream &operator<<(ostream &output, const Point &p)
{
    output<<'[' <<p.x<<","<<p.y<<']';

    return output;
}

//#ifndef CIRCLE_H
#define CIRCLE_H
//#include <iostream>
//#include <iomanip>
//#include "point.h"

class Circle : public Point //Herencia de Point
{
    friend ostream &operator<<(ostream &, const Circle &);
        public:
            Circle (float r=0.0, float c =0, float y=0);
            void setRadius(float);
            float getRadius() const;
            float area() const;
        protected:
            float radius;
};
//#endif

//#include "circle.h"

Circle::Circle(float r, float a, float b): Point (a,b)
{
    radius = r;
}

void Circle::setRadius(float r){radius = r;}
float Circle::getRadius() const {return radius;}
float Circle::area() const {return 3.1416 * radius * radius;}
//Salida en el formato 
//Center = [x,y]; Radius =#.## 
ostream &operator <<(ostream &output, const Circle &c)
{
    output<<"Center= ["<<c.x<<","<<c.y<<"]; Raidus = "<<setprecision(2)<<c.radius;
    return output;
}

//Prueba.cpp
//Probando apuntadores a clase case a apuntadores a clase derivada 
//#include "point.h"
//#include "circle.h"

int main()
{
    Point *pointPtr, p(3.5,5.3);
    Circle *circlePtr, c(2.7, 1.2, 8.9);

    cout<<"Point p:"<<p<<"\nCircle c: "<<c<<endl;

    //Maneja a un circle como Circle 
    pointPtr = &c; //asigna la direccion de Circle a pointPtr
    circlePtr = (Circle *) pointPtr;//Mascara de base derivada 
    cout<<"\nArea de c (via circlePtr):"<<circlePtr->area()<<endl;

    //Es riesgoso manejar un Point como Circle 
    //getRadius () Regresa basura 
    pointPtr= &p; //Asigna direccion de Point a Pointptr
    circlePtr = (Circle *) pointPtr; // mascara de base a derivada
    cout<<"\nRadio de objeto apuntador por Circle PTR: "<<circlePtr->getRadius()<<endl;
}
