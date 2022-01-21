#tratamiento de excepciones 

i=5
j=0

try:
    k=i/j
    print('Esto no se va a ejecutar')
except ZeroDivisionError:
    print('Ha intentado dividir por cero')

print("Fin del programa")