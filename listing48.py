class A:
    def metodo(self, x):
        print("Ejecutando metodo (%s,%s)"%(self,x))
    @classmethod # Metodo de clase 
    def metodo_de_clase(cls,x):
        print("Ejecutando metodo de clas(%s,%s)"%(cls,x))
    @staticmethod #Metodo estatico 
    def metodo_estatico(x):
        print("Ejecutando metodo estatico (%s)"%x)

#script de ejecucion
a = A()
#la llamada normal a un metodo de instancia. 
#El objeto es pasado de manera implicita como primer argumento  
a.metodo(1)

#salida = :Ejecutando metod(<...main__.A object at 0xb7dbef0>,1)
#En un metodo de la clase, la clase del objeto es pasada 
#Implicitamente como primer argumento 

a.metodo_de_clase(1)
#salida: Ejecutando metodo de clase (<class '__main__.A'>1)

#Tambien puede ejecutarse un metodo de clase usando 
#el nombre de la clase   

A.metodo_de_clase(1)

#salida: Ejecutando metodo de clase (<class '__main__.A'>1)

#un metodo estatico no pasa implicitamente ni al objeto a
#ni a la clase como primer argumento
a.metodo_estatico(1)
#salida: Ejecutanto metodo estatico(1)

#Metodo esta confinado al obejto a 
print(a.metodo)

#metodo estatico no esta confinado ni al objeto 
#ni a la clase, no va dica informacion como argumento
print(a.metodo_estatico)
print(A.metodo_estatico)