#include <iostream>

using namespace std;

int main ()
{
    int cuenta =0;
    cout <<" Cuantos empleados cuenta la empresa de: "<<endl;
    cin >> cuenta;
    int empleados[cuenta], pagos[cuenta], hijos[cuenta];
    int antiguedad;
    char nombres[cuenta][40], n;
    int pago=0;
    int h ;
    for (int i = 1; i <= cuenta; i++)
    {
        cout <<"Ingresa el nombre del empleado: \t";
        fflush(stdin);
        cin.getline(nombres[i], 40); 
        cout <<"\nCon cuantos hijos cuenta ?:"<<endl;
        cin>>h; 
        hijos[i] = h; 
        cout <<"\nIngresa la antiguedad del empleado en meses"<<(i+1)<<":"<<endl;
        cin>>antiguedad;
        empleados[i] = antiguedad;
        if (antiguedad>=12&& antiguedad<36)
        {
           int  antiguedad2 =(int) antiguedad/6;
            cout <<" "<<antiguedad2 ;
            for (int j = 1; j < antiguedad2; j++)
            {
                pago += 2500;
            }
            pagos[i] = pago;
            pago = 0;
        }else if ( antiguedad>=36){
            pagos[i] = 20000;
        } else if(antiguedad<=11 && antiguedad<12){
            pagos[i] = 0;
        }
        antiguedad = 0;
        cout <<"\n\n\n\n";
    }
    cout<<"\n\nEmpleados de la empresa\n"<<cuenta<<endl;
    int contador = 0, cont=0;
    for (int i = 1; i <= cuenta; i++)
    {
        cout <<"Nombre: "<<nombres[i]<<"\tPago: "<<pagos[i]<<" "<<endl;
        if (hijos[i]>=2)
        {
            contador += pagos[i];   
            cont ++; 
        }
        
    }

    cout <<"Sueldo promedio de las personas que tienen mas de 2 hijos : "<<contador/cont<<endl;
    
    return 0;

}