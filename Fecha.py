class fecha:
    def ini(self):
        self.dia = 0 
        self.ano = 0
        self.mes = 0
    def setMes(self, mes):
        if mes<=12 :
            self.mes = mes
            return True
        else:
            print("No se puede aceptar la fecha mes ")
            return False
    def setDia(self, dia ):
        if(dia<=31):
            self.dia = dia
            return True
        else:
            print("No se puede aceptar la fecha dia ")
            return False
    def setAn(self, An):
        if An<=9999 and An>0:
            self.ano = An
            return True
        else:
            print("No se puede aceptar la fecha ano")
            return False
    def getMes(self):
        return self.mes
    def getDia(self):
        return self.dia
    def getAn(self):
        return self.ano
    
#Script de llamada blanco

a = fecha()
a.ini()
print("Introduce el dia ")
dia = int(input())
a.setDia(dia)
print("Introduzca el Mes ")
mes = int(input())
a.setMes(mes)
print("Introduzca el ano ")
an = int(input())
a.setAn(an)


print(a.getDia(),"/", a.getMes(),"/" , a.getAn())