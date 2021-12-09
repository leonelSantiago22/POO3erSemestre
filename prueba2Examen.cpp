#include <iostream>

using namespace std; 

class sueldobase{
    protected:
    int sueldo;
    public:
    friend ostream& operator<<(ostream& op, const sueldobase& s)
    {
        op<<s.sueldo;
        return op;
    }
    int  operator+(const int&  s)const;
    sueldobase(int x)
    {
        sueldo = x; 
    }
    void setSueldo(int x)
    {
        if (x>=0)
        {
            sueldo = x;
        }
    }
    int getSueldo()
    {
        return sueldo;
    }
    ~sueldobase(){
        sueldo =0;
    }
};

int sueldobase::operator+(const int& s)const
{
    int x(this *);
    x = x+s;
    return x;
}

int main()
{
    sueldobase x(3);
    sueldobase c(4);
    sueldobase b(x);
    b = c+x;
    cout<<b;
}