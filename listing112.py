#ejemplo de assert

def printNumbre(myInt):
    assert myInt != None, 'Dato no debe ser Nulo'
    print(myInt)

a = 10 
b = None
c= None

b = a 
printNumbre(b)
printNumbre(c) # Esta parte es la que provoca el error