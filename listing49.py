class Persona:
    nPersonas = 0
    MAX = 100  #no es una constante 
    def __init__(self, nom):
        self.nombre = nom
        print("Persona: " +self.nombre)
        Persona.nPersonas+=1 
        
    @classmethod
    def getMax(cls):
            return cls.MAX
    
    @classmethod
    def getnPersonas(cls):
        return cls.nPersonas
    def getnPersonas2(self):
        return self.nPersonas
    
#codigo Pricipal

print("Numero maximo de personas: ", Persona.getMax())
print("Numero de personas: ", Persona.getnPersonas())

per1 = Persona("Persona 1 ")

print("Numero maximo de personas: ", Persona.getMax())
print("Numero de personas: ", Persona.getnPersonas())

per2 = Persona("Persona 2 ")
print(Persona.getMax())
print(per2.getnPersonas())
print(per2.getnPersonas2())