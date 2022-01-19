#include <iostream>

using namespace std;

template <class T, class U>

class Pair
{
private:
    T first;
    U second;
public:
    Pair(T f, U second){
        first = f;
        this->second = second;
    }
    T getFirst()
    {
        return first;
    }
    U getSecond(){
        return second;
    }
};

int main()
{
    Pair<float, int> *pair = new Pair<float, int>(10.5,2);

    cout<<"Obten el primer elemento:"<<pair->getFirst()<<endl;
    cout<<"Obten el segundo elemento:"<<pair->getSecond()<<endl;

    return 0;
}