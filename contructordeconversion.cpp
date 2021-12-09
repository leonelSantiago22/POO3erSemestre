#include <iostream>
using namespace std;

struct A
{
    A() { }         // constructor de conversión (desde C ++ 11)
    A(int) { }      // constructor de conversión
    A(int, int) { } // constructor de conversión (desde C ++ 11)
};
 
struct B
{
    explicit B() { }
    explicit B(int) { }
    explicit B(int, int) { }
};
 
int main()
{
    A a1 = 1;      // OK: la inicialización de la copia selecciona A :: A (int)
    A a2(2);       // OK: la inicialización directa selecciona A :: A (int)
    A a3{4, 5};    // OK: la inicialización de la lista directa selecciona A :: A (int, int)
    A a4 = {4, 5}; // OK: la inicialización de la lista de copias selecciona A :: A (int, int)
    A a5 = (A)1;   // OK: la conversión explícita realiza static_cast, inicialización directa
 
// B b1 = 1; // error: la inicialización de la copia no considera B :: B (int)
    B b2(2);       // OK: la inicialización directa selecciona B :: B (int)
    B b3{4, 5};    // OK: la inicialización de la lista directa selecciona B :: B (int, int)
// B b4 = {4, 5}; // error: la inicialización de la lista de copias seleccionó un constructor explícito
                   //        B::B(int, int)
    B b5 = (B)1;   // OK: la conversión explícita realiza static_cast, inicialización directa
    B b6;          // OK, inicialización por defecto
    B b7{};        // OK, inicialización de lista directa
// B b8 = {}; // error: la inicialización de la lista de copias seleccionó un constructor explícito
                   //        B::B()
}