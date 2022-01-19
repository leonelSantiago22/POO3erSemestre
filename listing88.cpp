#include <iostream>

using namespace std; 

template<class T>
class Stack {
    public:
        Stack(int = 10);
        ~Stack() { delete [] stackPtr;}
        char push( const T&);
        char pop(T&);
    private:
        int size; 
        int top; 
        T *stackPtr;

        char isEmpty() const {return top == -1;}
        char isFull() const { return top == size-1;}
};

template <class T> 

Stack<T>::Stack(int s)
{
    size = s > 0 ? s : 10; 
    top = -1;
    stackPtr= new T[ size];
}

template <class T>

char Stack<T>::push( const T &pushValue)
{
    if(!isFull()){
        stackPtr[++top] = pushValue;
        return 1;
    }
    return 0;
}

template <class T>
char Stack<T>::pop(T &popValue)
{
    if (!isEmpty())
    {
        popValue = stackPtr[top--];
        return 1;
    }
    return 0;
}

int main()
{
    Stack<double> doubleStack(5);
    double f = 1.1;
    cout<<"Insertando elementos en double Stack \n";

    while (doubleStack.push(f))
    {
        cout<<f<<' ';
        f +=1.1;
    }
    cout<<"\nLa pila esta llena. No se puede insertar el elemento"<<f<<"\n\nSacanado elementos de doubleStack\n";

    while (doubleStack.pop(f))
    {
        cout<< f << ' ';
    }
    cout<<"\nLa pila esta vacia. No se pueden eliminar mas elementos\n";

    Stack<int> intStack;
    int i = 1; 
    cout<<"\nInsertando elementos intStack\n";

    while (intStack.push(i))
    {
        cout<< i <<' ';
        ++i;
    }
    cout<<"\nLa pila esta llena"<<i << "\n\nSacando elementos de intStack\n";
    while (intStack.pop(i))
    {
        cout<< i << ' ';
    }

    cout<<"\nLap ila esta vacia. No se pueden eliminar mas elementos \n";
    return 0;
}