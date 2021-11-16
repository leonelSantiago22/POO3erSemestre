#include <iostream>
#include <time.h>
#include <stdlib.h>

using namespace std;

class Arr{
    private:
    int a[10];
    public:
    Arr(int x = 0){
        srand(time(NULL));
        for (int i = 0; i <10; i++)
        {
            if (x==0)
            {
                x = rand()%100;
            }
            a[i] = x; 
        }
        
    }
    char set(int, int);
    int get(int) const;
    int get(int); 
};

char Arr::set(int pos, int val)  {
    if (pos>=0 && pos<10) 
    {
        return a[pos] = val;
    }
    return 0;
}

int Arr::get(int pos)const
{
    if (pos>=0&&pos<10)
    {
        return a[pos];
    }
    return 0;
}

int Arr::get(int pos) 
{
    if (pos>=0 && pos<10)
    {
        return a[pos];
    }
    return 0;
}

int main()
{
    const Arr a(5), b;
    Arr c;

    c.set(0,3);

    c.set(1,33);
    cout <<a.get(0)<< endl;
    cout<<a.get(1)<<endl;
    cout <<b.get(0)<< endl;
    cout<<b.get(1)<<endl;
    cout <<c.get(0)<<endl;
    cout<<c.get(1)<<endl;

    return 0;
}