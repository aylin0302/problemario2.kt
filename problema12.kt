#Resolución de sistemas lineales: Implementa una función que resuelva 
#un sistema de ecuaciones lineales usando el método de eliminación de 
#Gauss. 

def gauss_eliminacion(A, b):
    n = len(b)
    # Hacer la matriz aumentada
    for i in range(n):
        A[i].append(b[i])

    # Eliminación hacia adelante
    for i in range(n):
        # Hacer el pivote 1 dividiendo por sí mismo
        pivote = A[i][i]
        for j in range(i, n + 1):
            A[i][j] /= pivote
        
        # Hacer ceros en las filas siguientes
        for k in range(i + 1, n):
            factor = A[k][i]
            for j in range(i, n + 1):
                A[k][j] -= factor * A[i][j]

    # Sustitución hacia atrás
    x = [0] * n
    for i in range(n - 1, -1, -1):
        x[i] = A[i][n]
        for j in range(i + 1, n):
            x[i] -= A[i][j] * x[j]
    return x

# Ejemplo de uso:
A = [[2, -1, 1], [1, 3, 2], [1, -1, 2]]
b = [8, 13, 5]
solucion = gauss_eliminacion(A, b)
print("Solución:", solucion)
