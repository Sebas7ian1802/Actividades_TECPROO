print("Digite su nombre")
nom=input().lower()
vocales="aeiou"
canVo=0
for c in nom:
    if c in vocales:
        canVo+=1
print(f"Su nombre tiene {canVo} vocales")

print("  ")
print("#####################################################")
print("  ")
               
nom2=nom.upper()
nomIn=nom2[::-1]
print("Su nombre imvertido es: " + nomIn)

print("  ")
print("#####################################################")
print("  ")

print("Su nombre en vertical es: " )
for c in nom:
    print(c)

print("  ")
print("#####################################################")
print("  ")

print("Su nombre invertido es: ")
for c in nomIn:
    print(c)

















