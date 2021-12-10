

class Persona:
        def __init__(self, nombre, apellido):
            self.nombre = nombre
            self.apellido = apellido
        def nombreCompleto(self):
            return self.nombre + " "+self.apellido

class Empleado(Persona):
    def __init__(self, nombre, apellido, staffnum):
        Persona.__init__(self, nombre, apellido)
        self.staffnum = staffnum
    def getEmpleado(self):
        return self.nombreCompleto() +" ,"+self.staffnum

#script de ejecucion inicial 

x = Persona("una", "Persona");
y = Empleado("un", "Empleado","121212")

print(x.nombreCompleto())
print(y.getEmpleado())
