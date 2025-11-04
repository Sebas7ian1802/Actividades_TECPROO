print("Ejemplos con arreglos unidimensionales")
can = int(input("digite cantidad de edades: "))
edades = []
for i in range(can):
    edad = int(input("Edad ingresada en la posición: "+str(i)+": "))
    edades.append(edad)

for i in range(can):
    for j in range(i + 1, can):
        if edades[i] > edades[j]:
            aux = edades[i]
            edades[i] = edades[j]
            edades[j] = aux

print("Lista de edades ordenadas")
for e in edades:
    print(e)
#insertar edad
edades1=edades.copy()
for e in edades1:
    print(e)
posi=int(input("Digite la posicion donde se va a insertar la nueva edad: "))
if posi<len(edades1):
    edad=int(input("Digite la edad a insertar: "))
    edades1.insert(posi,edad)
for e in edades1:
    print(e)
#utilizar la misma logica para eliminar 