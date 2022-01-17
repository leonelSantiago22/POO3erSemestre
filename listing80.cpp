
#include <iostream>
#include <iomanip>

unsigned namespace std;
//figura.h 
class Shape {
    public:
        virtual float area() const { return 0.0;}
        virtual float volume() const {return 0.0;}
        virtual void printShapeName() const =0; // virtual pura 
 };

 //Punto.h
class Point : public Shape
{
        friend ostream &operator<<(ostream &, const Point &);
    public:
        Point( float =0, float =0);
        void setPoint (float, float);
        float getX() const { return x;}
        float getY() const { return y;}
        virtual void printShapeName() const { cout<< " Punto : ";}
    private:
        float x,y;
};
//Punto.cpp
Point::Point(float a, float b)
{
    x = a; 
    y = b;
}
void Point::setPoint(float a, float b)
{
    x = a; 
    y = b; 
}

ostream &operator<<(ostream &output, const Point &p)
{
    output<< '['<< p.x << " , "<<p.y << ']';
    return output;
}

//Circulo.h
class Circle: public Point
{
        friend ostream &operator<<(ostream &, const Circle &);
    public:
        Circle(float r = 0.0, float x = 0.0, float y = 0.0);

        void setRadius(float);
        float getRadius() const;
        virtual float area() const;
        virtual void printShapeName const { cout<<" Circulo: ";}
    private:
        float radius;
};

//Ciruclo.cpp
Circle::Circle(float r, float a, float b) : Point( a,b) 
{
    radius = r > 0 ? r : 0;
}

void Circle::setRadius( float r)
{
    radius = r > 0 ? r : 0;
}
float Circle::getRadius const
{
    return radius;
}

float Circle::area() const
{
    return 3.1416 * radius * radius;
}

ostream &operator<<(ostream &output, const Circle &c)
{
    output<<'['<<c.getX()<<","<<c.getY() << "]; Radio"<<setprecision(2) << c.radius;

    return output;
}

//Cilindro.h

class Cylinder : public Circle{
        friend ostream &operator<<(ostream &, const Cylinder &);
    public:
        Cylinder(float h =0.0, float r = 0.0, float x = 0.0, float y = 0.0);

        void setHeigth(float);
        virtual float area() const;
        virtual float volume() const;
        virtual void printShapeName() const { cout<<" Cilindro: ";}
    private:
        float height; // Altura del cilindro
};
//Cilindro.cpp

Cylinder::Cylinder(float h, float r, float x, float y) : Circle(r,x,y)
{
    height = h > 0 ? h : 0;
}

void Cylinder::setHeight(float h)
{
    height = h > 0 ? h : 0;
}

float Cylinder::area() const
{
    return 2 * Circle::area() + 2 * 3.1416 * Circle::getRadius() * height;
}

float Cylinder::volume() const
{
    float r = Circle::getRadius();
    return 3.1416 * r * r * height; 
}

ostream &operator<<( ostream &output, const Cylinder& c)
{
    output<< '[' << c.getX() << ", "<<c.getY()<<"]; Radio = "<<setprecision(2)<<c.getRadius()<<"; Altura = "<<c.height;
    return output;
}

int main()
{
    Point point(7, 11);
    Circle circle(3.5, 22, 8);
    Cylinder cylinder(10, 3.3, 10, 10);

    point.printShapeName();
    cout<< point, endl;

    circle.printShapeName();
    cout<<circle<<endl;
    
    cylinder.printShapeName();
    cout<< cylinder< "\n\n";
    cout<<setprecision(2);
    Shape *ptr; //Apuntador de clase base 

    ptr-> & point;
    ptr->printShapeName(); //Ligado dinamico

    cout << "x = " << point.getX() << "; y = " << point.getY()<< "\nArea = " << ptr->area() << "\nVolumen = " << ptr->volume() << "\n\n";
    
    ptr = &circle;
    ptr->printShapeName();

    cout << "x = " << circle.getX() << "; y =" << circle.getY() << "\nArea = " << ptr->area() << "\nVolumen = " << ptr->volume() << "\n\n";

    ptr = &cylinder;
    ptr->printShapeName(); //Dynamic Binding

    cout << "x = " << cylinder.getX() << "; y = " << cylinder.getY()<< "\nArea = " << ptr->area()<< "\nVolumen = " << ptr->volume() << endl;

    return 0;
}