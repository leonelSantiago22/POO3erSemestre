class Persona:
    def __init__(self, nombre, edad, sexo):
        self.nombre = nombre
        self.edad = edad
        self.sexo = sexo
        
    def __str__ (self):
        return self.nombre +" "+ str(self.edad)+ " "+self.sexo

class Estudiante(Persona):
    def __init__(self, nombre, edad, sexo, matr, horas):
        #en Python 3 no se necesita self al llamar 
        #a super() ni la sintaxis super(subclase, self)
        #de python 2
        super().__init__(nombre, edad, sexo)
        self.matricual = matr
        
#creando dos objetos 

a = Persona("Ironmas", 37, "m")
b = Estudiante("Spidermas", "36", "m","000-13-5031", 24)

print(a)
print(b)