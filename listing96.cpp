#include <iostream>
#include <exception>
using namespace std; 

class myexception: public exception{
    virtual const char* what() const throw()
    {
        return "Mi exception se ejecuto";
    }
}myex;


int main()
{
    try
    {
        throw myex;
    }
    catch(const exception& e)
    {
        cout << e.what() << '\n';
    }
    
}