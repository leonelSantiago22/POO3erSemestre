#Ejemplo try/except/else/finally
sep = '-' * 45+ '\n'
print(sep+'Excepcion lanzada y cachada ')
try:
    x = 'spam'[99]
except IndexError as e:
    print('Except: ',e)
finally:
    print('Finally')
print('Despues de bloque try')
print(sep + 'No se lanza Excepcion')

try:
    x = 'sapam'[3]
except IndexError:
    print('Except')
finally:
    print('finally')
print('Despues de bloque TRy')
#sep dibuja la linea punteada para separacion de bloques de las palabras 
print(sep +'no se lanza excepcion, con opcion else')
try:
    x ='spam'[3]
except IndexError:
    print('Except')
else:
    print('else')
finally:
    print('Finally')

print('after')

print(sep+ 'Excepcion lanzada pero no cachada')

try:
    x = 1/0
except IndexError:
    print('Except')
finally:
    print('Finally')

print('after')