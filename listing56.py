from typing import final

class Punto:
    def __ini__(self,x = 10, y =10):
        self.x = x
        self.y =y
    def __add__(self, op):
        return Punto(self.x+op.x, self.y+op.y)
    def __sub__(self, op):
        return Punto(self.x-op.x, self.y-op.y)
    def __mul__(self, f):
        temp = Punto(self.x*f, self.y*f)
        return temp
    def __gt__(self, op): #>
        return(self.x>op.x and self.y>op.y)
    def __le__ (self, op): #<=
        return (self.x<=op and self.y<=op.y)
#principal 
a = Punto(1,1)
b = Punto(1)
c = Punto()
print(a.x)
print(b.x)
print(c.x)

c = a+b

print(c.x)
print(c.y)

p = a-b
print(p.x)
print(p.y)

print(a>b)
print(a<=b)
