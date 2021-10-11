#include <iostream>

using namespace std;

int punto(int =5, int =4);

int main()
{
        cout <<"valor 1:"<<punto()<<'\n';
        cout <<"valor 2:"<<punto(1)<<'\n';
        cout <<"valor 3:"<<punto(1,3)<<'\n';
        getchar();

        return 0;
}

int punto(int x, int y)
{
    if (y!=4)
    {
        return y;
    }
    if (x!=5)
    {
        return x;
    }
    return x+y;
    
}