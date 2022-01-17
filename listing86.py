#polimorfismo y clase abstracta en Python
from abc import ABC, abstractclassmethod #Metodo abstracto 

class Shape(ABC):
    def area(self):
        return 0
    def volumen(self):
        return 0
    
    @abstractclassmethod
    def getName(self):
        pass
    
class Point(Shape):
    def __init__(self, a,b):
        self.x = a 
        self.y = b
    def setPoint(self, a, b):
        self.x = a 
        self.y = b
    def getX(self):
        return self.x
    def getY(self):
        return self.y
    def toString(self):
        return "[" + str(self.x) + ", "+ str(self.y) + "]"
    def getName(self):
        return 'Punto'
class Circle (Point):
    def __init__(self,r, a ,b ):
        super().__init__(a,b)
        self.radius = r 
    def setRadius(self, r):
        if r>=0:
            self.radius = r 
        else:
            self.radius = 0
    def area(self):
         return "Centro = "+ super().toString() + " Radio = " + str(self.radius)
    def getName(self):
         return 'Cilindro'
class Cylinder (Circle):
    def __init__(self,h, r, a, b):
        super().__init__(r, a, b)
        self.heigth = h 
    def setHeight(self, h):
        if h>= 0:
            self.heigth = h
        else:
            self.heigth =0 
    def getHeight(self):
        return self.heigth
    def area(self):
        return 2 * super().area() + 2 * 3.14159 * self.radius * self.heigth
    def volumen(self):
        return super().area() * self.heigth
    def toString(self):
        return super().toString() + "; Altura = " + str(self.heigth)
    def getName(self):
        return 'Cilindro'
#Script de prueba 
point = Point(7,11)
circle = Circle(3.5 , 22, 8)
cylinder = Cylinder(10, 3.3 , 10 , 10)
arrayOfShapes = [ point, circle , cylinder]

print(point.getName() + ": " + point.toString())
print(circle.getName() + ": "+ circle.toString())
print(cylinder.getName() + ": "+ cylinder.toString())

for sh in arrayOfShapes:
    print(sh.getName() + ": " + sh.toString())
    print("Area = " + str(sh.area()))
    print("Volume = " + str(sh.volumen()))
    