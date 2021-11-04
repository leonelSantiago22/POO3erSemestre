class Ejemplo:
    def unMetodo(self, x, y):
        self.i=x
        self.j=y
        print("El valor de is es "+str(self.i))
        print("El valor de j es "+str(self.j))#str convierte a cadena el valor 
#script de ejecucion 
obj1 = Ejemplo()
obj2 = Ejemplo()
obj1.unMetodo(10,20)
obj2.unMetodo(100,200)