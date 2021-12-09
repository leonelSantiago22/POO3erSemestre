#include <iostream>

using namespace std; 
class Lenguaje 
{
    protected: 
    char * Lenguaje2;
    char * Lenguajecd;
    public:
    Lenguaje(char * _L, char * _x)
    {
        Lenguaje2 = _L;
        Lenguajecd = _x;
    }
    friend ostream& operator <<(ostream& os, const Lenguaje& op);
    void setL(char * _L)
    {
        if (_L!=NULL)
        {
            Lenguaje2 = _L;
        }else{
            return;
        }
        
    }
    void setX(char *_x)
    {
        if (_x!=NULL)
        {
            Lenguajecd = _x;
        }
        
    }
    char * getL()
    {
        return Lenguaje2;
    }
    char * getX()
    {
        return Lenguajecd;
    }
    ~Lenguaje()
    {
        if (Lenguaje2!=NULL)
        {
            Lenguaje2 = NULL;
            Lenguajecd = NULL;
            delete [] Lenguaje2;
            delete [] Lenguajecd;

        }
        
    }
};

ostream& operator<<(ostream& os, const Lenguaje& op)
{
    os<<op.Lenguaje2<<'/'<<op.Lenguajecd;
    return os;
}

class lenguajeHumano: virtual public Lenguaje{
    protected: 
    char *lenguajeH; 
    char *palabra;
    public:
    lenguajeHumano(char *_l, char * _x): Lenguaje(_x, _l)
    {
        lenguajeH= _l;
        palabra = _x;
    }
    friend ostream& operator<<(ostream& os, const lenguajeHumano& op);
    void setLenguaje(char *_l)
    {
        if(_l!=NULL)
        {
            lenguajeH = _l;
        }else{
            return;
        }
    }
    void setPalabra(char *_x)
    {
        if (_x!=NULL)
        {
            palabra = _x;
        }else{
            return;
        }  
    }
    char * getLenguaje()
    {
        return lenguajeH;
    }
    char * getPalabra()
    {
        return palabra;
    }
    ~lenguajeHumano()
    {
        if (lenguajeH!=NULL)
        {
            lenguajeH = NULL;
            palabra = NULL;
            delete []lenguajeH;
            delete []palabra;
        }
        
    }
};

 ostream& operator<<(ostream & os, const lenguajeHumano& op)
 {
     
     os<<op.palabra<<","<<op.lenguajeH<<'?'<<op.Lenguaje2<<'/'<<op.Lenguajecd;
     return os;
 }
class LenguajeMaquina: virtual public Lenguaje{
    private:
    char *binario;
    char *binario2;
    public:
    friend ostream& operator<<(ostream& os, const LenguajeMaquina& op);
    LenguajeMaquina(char *_l,char * _x): Lenguaje(_l, _x)
    {
        binario = _l;
        binario2 = _x;
    }
    void setBinario(char *_l)
    {
        if (_l!=NULL)
            binario = _l;
        else
            return;
    }
    void setBinario2(char *_x)
    {
        if(_x!=NULL)
            binario2 = _x;
        else
            return;
    }
    char * getBinario()
    {
        return binario;
    }
    char * getBinario2()
    {
        return binario2;
    }
    ~LenguajeMaquina()
    {
        if (binario!=NULL)
        {
            binario = NULL;
            binario2 = NULL;
            delete []binario;
            delete []binario2;
        }
    }
};

ostream& operator<<(ostream& os, const LenguajeMaquina& op)
{
    os<<op.binario<<","<<op.binario2<<"/"<<op.Lenguaje2<<","<<op.Lenguajecd;
    return os;
}
class LenguajeMixto: public LenguajeMaquina, public lenguajeHumano{
    protected:
    char *mixto;
    char *mixto2;
    public:
    friend ostream& operator<<(ostream&os,  LenguajeMixto& op);
    LenguajeMixto(char * _l, char *_x): LenguajeMaquina(_l, _x), Lenguaje(_l,_x), lenguajeHumano(_l,_x)
    {
        mixto = _l;
        mixto2 = _x;
    }
    void setMixto(char *_l)
    {
        if(_l!=NULL)
            mixto = _l;
        else
            return;
    }
    void setMixto2(char *_x)
    {
        if(_x!=NULL)
            mixto2 = _x;
        else
            return;
    }
    char * getMixto()
    {
        return mixto;
    }
    char *getMixto2()
    {
        return mixto2;
    }
    ~LenguajeMixto()
    {
        if (mixto!=NULL)
        {
            mixto = NULL;
            mixto2 = NULL;
            delete []mixto;
            delete []mixto2;
        }else{
            return;
        }
        
    }
};
ostream& operator<<(ostream& os,  LenguajeMixto& op)
{
    os<<op.mixto<<","<<op.mixto2<<"/"<<op.Lenguajecd<<op.Lenguaje2<<"/"<<op.getBinario()<<","<<op.getBinario2()<<"/"<<op.palabra<<","<<op.lenguajeH;
    return os;
}
int main()
{
    Lenguaje xd((char *)"HOla",(char *)"cola");
    cout<<xd;
    //Lenguaje xd2;
    /*xd.setL((char *)"Hola");
    xd.setX((char *)"bb");
    cout<<xd;*/
    cout<<endl;
    lenguajeHumano xd2((char*)"Hola",(char*)"patrona");
    cout<<xd2;
    cout<<endl;
    xd2.setL((char *)"Prueba");
    xd2.setX((char *)"BB");
    cout<<xd2;
    cout<<endl;
    LenguajeMaquina l((char *)"hola", (char *)"Holassss");
    l.setL((char *)"como ");
    l.setX((char *)"estas");
    cout<<l;
    cout<<l.getBinario2();
    cout<<endl;
    LenguajeMixto M((char *)"Mixto1", (char *)"Mixto2");
    M.setL((char *)"Lenguaje");
    M.setX((char *)"Lenguaje2");
    M.setBinario2((char *)"Binario1");
    M.setBinario((char *)"Binario1");
    M.setPalabra((char *)"Humano1");
    M.setLenguaje((char *)"Humano 2 ");
    cout<<M;
}