s = "Hola mundo!!!!"
print(s)
print(s[1])
print(s[7:12])

#elimina caracteres een blanco del lado izquierdo y derecho de la cadena 

print(s.strip())
print(len(s))
print(s.lower())
print(s.upper()) 

#sustituye "l" por "j"
print(s.replace("l", "j"))
#separa una cadena y regresa una lista de cadenas 
str = "Un ejemplo de String......"
print(str.split())
print(str.split('e', 1 ))
print(str.split('e'))


print("Nombre : ")
n = input()
print("Hola, "+n)