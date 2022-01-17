#ejemplo de polimorfismo en python
class base:
    def quien(self):
        print('base')
class primera (base):
        def quien(self):
            print('primera')
class segunda(base):
    def quien(self):
        print('Segunda')
class Tercera(base):
    def quien(self):
        print('tercera')
class tercera (base):
    def foo(self):#Solo aparecera lo de la clase base
        return

#Script de ejecucion
objBase = base()
obj1 = primera()
obj2 = segunda()
obj3 = tercera()

pBase = objBase
pBase.quien()
pBase = obj1
pBase.quien()
pBase = obj2
pBase.quien()
pBase = obj3
pBase.quien() 