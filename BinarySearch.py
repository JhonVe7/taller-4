from random import randint
from builtins import str


def Quick_sort(V):
    pivote = len(V)//2
    menor, igual, mayor = [],[],[]
    
    for i in range(len(V)):
        if(V[i] < V[pivote]): menor.append(V[i])
        elif(V[i]> V[pivote]): mayor.append(V[i])
        else: igual.append(V[i])
        
    if len(menor)>1: 
        menor = Quick_sort(menor)
    if len(mayor)>1: 
        mayor = Quick_sort(mayor)
    return menor + igual + mayor

def main():
    
    Tamain = (input("Escriba los numeros separados por comas \n"))
    print(Tamain)
    Tamain_2 = Tamain.split(",")
    print(Tamain_2)
    Tamain_3 = Quick_sort(Tamain_2)
    print(Tamain_3)
    
    Valor = (input("Ingrese el numero que desea buscar \n"))
    
    Inicio = 0
    Final = (len(Tamain_3)-1)
    Encontro = False
    
    while(not(Encontro) and Inicio <= Final):
        mitad = int((Inicio + Final)/2)
        if(Valor == Tamain_3[mitad]):
            Encontro = True
            Num = mitad
        elif(Valor < (Tamain_3[mitad])):
            Final = mitad - 1
            
        else:
            Inicio = mitad + 1
    print()
    
    if(Encontro):
        print("El Numero se encuentra en la posicion " + str(Num))
    else:
        print("El dato no se encuentra")
    print()
       
       
main()

