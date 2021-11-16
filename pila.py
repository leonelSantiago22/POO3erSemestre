class Pila :
    
    
    def ini(self):
        self.tam = 100
        self.pila = []
        self.tope = -1
    def push(self, item):
        if self.tam > 100:
            print("LA cola esta llena")
            return False        
        else : 
            self.tope +=1
            self.pila.append(item)
            return True
    def pop(self):
        if self.tam == 0 : 
            print("LA cola esta vacia")
            return False
        else : 
            return self.pila[self.tope-1]
    def peek(self):
        return self.tope
    def display(self):
       while self.tope> -1:
           print(self.pila[self.tope])
           self.tope -=1
        #return True
        
        
#Script de ejecucion

a = Pila()

a.ini()

a.push(10)
a.push(100)
a.push(200)

#print(a.display())
#print(a.display()
a.display()

a.pop()
print("Despues de borrar el elemento de inicial")
a.display()
