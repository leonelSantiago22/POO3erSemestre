class MiClase:
    def modifica(self):
        self.x+=1
        
    def modifica(self, y):
        self.x = y*y
        
#prueba 

mc = MiClase()
mc.modifica(5)
print(mc.x)
mc.modifica(10)
print(mc.x)