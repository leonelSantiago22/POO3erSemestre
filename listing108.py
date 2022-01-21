#excepcion definida por el usuario
class DivisionByZeroException (Exception):
    def __str__(self):
        return 'Mi excepcion'
class DivisionByZero:
    def division(self):
        num1= 10 
        num2= 0
        if num2==0:
            raise DivisionByZeroException()
        
        print('Division '+str(num1/num2))
#script
try:
    DivisionByZero().division()
except DivisionByZeroException:
    print('Ejecuntando script, detectando excepcion')
finally:
    print('Finally siendo ejecutado en el script de prueba')

print('Finalizando main')