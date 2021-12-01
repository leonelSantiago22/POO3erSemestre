#include <iostream>

class Point {
    public:
        Point(float =0.0, float = 0.0);
        ~Point();
    protected:
        float x,y;
};

using namespace std; 

Point::Point(float a, float b )
{
    x =a;
    y =b;

    cout << "Contructor Point: "<<'['<<x<<","<<y<<']'<<endl;
}

Point::~Point()
{
    Cout<<"Destructor point : " <<x<<","<<y <<']'<<endl;
}

class Circle : public Point{
    public:
        Circle(float r = 0.0, float x =0, float y =0);
        ~Circle();
    private:
    float radius;
};

Circle::Circle(float r, float a, float b): Point(a,b)
{
    radius = r; 
    cout <<"Contructor Circle: Radios es "<<radiu<<"["<<a<<","<<b<<"]"<<endl;
}

Circle::~Circle()
{
     cout<<"Destructor Circle: radio es "<<radius<<"["<<x<<","<<"]"<<endl;
}
int main()
{
    {
        Point p(1.1, 2.2);
    }
    cout<<endl;
    Circle circle1(a.5,7.2,2.9);
    cout<<endl;
    Circle circle2(10,5,5);
    return 0;
}