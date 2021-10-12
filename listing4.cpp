#include <iostream>

using namespace std;
int b =1;
int f(int);
int h(int x = f(b));

int main()
{
    b =1; 
    cout << b << endl;
    {
        int b =1;
        cout <<b<<endl;
        cout << h(b);
    }
    return 0;
}

int h(int z )
{
    cout <<"valor recibido: " <<z << endl;
    return z*z;
}
int f (int y)
{
    return y;
}