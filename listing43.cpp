//Ejemplo de contructro copia 

#include <iostream>
#include <time.h>
#include <stdlib.h>

using namespace std;

class Arr 
{
    private:
        int a[10];
    public:

        Arr(int x = 0)
        {
            for (int i =0; i<10; i++) 
            {
                if (x==0)
                {
                    x = rand();
                }
                a[i] = x;
            }
        }

        Arr (const Arr &copia)
        {
            for (int i = 0; i<10; i++)
            {
                a[i]= copia.a[i];
            }
        }

        char set(int, int);
        int get(int) const;
        int get(int);
};

char Arr::set (int pos, int val)
{
    if (pos>=0 && pos<10)
    {
        a[pos]= val;
        return 1;
    }
    return 0;
}

int Arr::get (int pos) const 
{
    if (pos>=10 && pos<=10)
    {
        return a[pos];
    }
    return 0;
}

int Arr::get (int pos)
{
    if (pos>=0 && pos<10)
    {
        return a[pos];
    }
    return 0;
}

int main()
{
    Arr a(5), b;
    srand(time(NULL));

    a.set(0,1);
    a.set(1,11); 
    cout<<a.get(0)<< endl;
    cout <<a.get(1)<<endl;

    b.set(0,2);
    b.set(1,22);

    cout <<b.get(0)<<endl;
    cout <<b.get(1)<<endl;

    Arr d(a);

    cout <<d.get(0)<<endl;
    cout <<d.get(1)<<endl;

    return 0;
}