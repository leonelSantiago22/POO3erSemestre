class Base1:   
        def __init__(self, x):
            self.value = x 
        def getData(self):
            return self.value

class Base2:
    def __init__(self, c):
        self.letter = c
    def getData(self):
        return self.letter
#Herenecia multiple 
class Derivada (Base1, Base2):
    def __init__(self, i,c,f):
        Base1.__init__(self, i)
        Base2.__init__(self,c)
        self.real= i 
    def geTReal(self):
        return self.real
#Script de inicio de ejecucion 
b1 = Base1(10)
b2 = Base2('Z')
d = Derivada(7,'A', 3.5)

print("Objeto b1 contiene enter", b1.getData())
print("Objeto b2 contiene caracter ", b2.getData())
print("Objeto d contiene", d.getData())