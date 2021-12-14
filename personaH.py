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
class servicios(Persona):
    def __init__(self, nombre, edad, tramite):
        super().__init__(nombre, edad)
        self.tramite = tramite
    def __str__(self):
        return "Nombre"+self.getNombre()+"\tedad: "+str(self.getEdad())+"\t Tramite "+self.tramite
    def setTramite(self, tramite):
        self.tramite = tramite
    def getTramite(self):
        return self.tramite
class Posgrado(Estudiante):
    def __init__(self, nombre, edad, matricula, materias):
        super().__init__(nombre, edad, matricula)
        self.materias = materias 
    def __str__(self):
        return "Nombre alumno de posgrado: \t"+self.getNombre()+"\tEdad: "+str(self.getEdad())+" \tMatricula : "+str(self.getMatricula())+"\tMaterias a cursar\t"+str(self.materias)
    def setMaterias(self, materias):
        if materias > 0 and materias<10:
            self.materias = materias
        else:
            return
    def getMaterias(self):
        return self.materias
class EstudianteProfesor(Posgrado, Profesor):
    def __init__(self, nombre, edad, matricula, materias,salario, horas ):
        Posgrado.__init__(self,nombre, edad, matricula, materias)
        Profesor.__init__(self, nombre, edad, salario)
        self.horas = horas
    def __str__(self):
        return "Nombre\t:"+self.getNombre()+"\tEdad:"+str(self.getEdad())+"\tMatricula"+str(self.getMatricula())+"\tMaterias: "+str(self.getMaterias())+"\tHoras"+str(self.horas)
    def setHoras(self, horas):
        if horas>0 and horas <24:
            self.horas = horas
        else:
            return
    def getHoras(self):
        return self.horas
        
#
x = Persona("Leo", 15)
print(x)
y = Estudiante("Leo", 15, 2453)
print(y)
p = Profesor("Alana", 40, 55445)
print(p)
es = EstudianteProfesor("Leo", 18, 123, 2, 10, 100)
print(es);
