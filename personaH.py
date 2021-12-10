class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    def  setEdad(self, edad):
        if(edad>0):
            self.edad = edad
        else:
            return
    def setNombre(self, nombre):
        if nombre!=type(None):
            self.nombre = nombre
        else:
            print("no se puede ")
            return
    def getNombre(self):
        return self.nombre
    def getEdad(self):
        return self.edad
    def __str__(self):
        return self.nombre+","+str(self.edad)
    
class Estudiante(Persona):
    def __init__(self, nombre, edad, matricula):
        super().__init__(nombre, edad)
        self.matricula = matricula
    def __str__(self):
        return "edad:\t"+str(self.getEdad())+" nombre: "+self.getNombre()+"\tMatricula :"+str(self.matricula)
    def setMatricula(self, matricula):
        if matricula != 0 :
            self.matricula = matricula
        else:
            return
    def getMatricula(self):
        return self.matricula
class Profesor(Persona):
    def __init__(self, nombre, edad, salario):
        super().__init__(nombre, edad)
        self.salario = salario
    def __str__(self):
        return "Nombre"+self.nombre+"\tEdad:\t"+str(self.edad)+"\tSalario: "+str(self.salario)
    def setSalario(self, salario):
        if salario != 0 :
            self.salario = salario
        else : 
            return
    def getSalario(self):
        return self.salario
#
x = Persona("Leo", 15)
print(x)

y = Estudiante("Leo", 15, 2453)
print(y)

p = Profesor("Alana", 40, 55445)
print(p)