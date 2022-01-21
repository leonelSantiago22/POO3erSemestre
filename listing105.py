#Ejemplo de lanzamiento de excepcion sin tratamiento en Python
i=1
j=0
if j==0 :
    raise ZeroDivisionError('Division entre 0')
else:
    print(i/j)
