class cola:
    def ini(self):
        self.sloc = self.rloc = -1
        self.q = []
    
    def setC(self, val):
        if self.sloc >1000:
            print("La cola es llena ")
            return False
        self.sloc+=1
        self.q.append(val)
        return True
    def getC(self):
        if self.rloc == self.sloc:
            print("LA cola esta vacia ")
            return False
        else:
            self.rloc+=1
            return self.q[self.rloc]
        
#Script de ejecucion
a = cola() 
b = cola() 

a.ini()
b.ini()

a.setC(1)
b.setC(2)
a.setC(11)
b.setC(22)

print(a.getC())
print(a.getC())
print(b.getC())
print(b.getC())

a.getC()