#tratamiento de excepciones y tratamiento general finally
from decimal import DivisionByZero


i=5
j=0

try:
    k = i/j
    print('Esto no se va a ejecutar')
except ZeroDivisionError:
    print('Ha intentado dividir por cero')
finally:
    print('Salida de finally')

print('Fin del programa')