#17. Números amigables: Escribe un programa para determinar si dos
#números dados son amigables (la suma de los divisores de uno es igual al
#otro y viceversa).

def suma_divisores(num):
    return sum(i for i in range(1, num // 2 + 1) if num % i == 0)

def numeros_amigables(a, b):
    return suma_divisores(a) == b and suma_divisores(b) == a


a, b = 120, 82
print(f"¿Son {a} y {b} números amigables? {numeros_amigables(a, b)}")
