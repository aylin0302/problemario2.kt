#2. Fibonacci generalizado: Crea una función que reciba dos números
#iniciales y calcule una serie similar a Fibonacci, pero con estos números
#como punto de partida.

def fibonacci_generalizado(a, b, n):
    series = [a, b]
    for i in range(2, n):
        series.append(series[-1] + series[-2])
    return series

# Ejemplo de uso:
a, b, n = 2, 3, 10
print(f"Fibonacci generalizado ({n} términos, inicio {a}, {b}): {fibonacci_generalizado(a, b, n)}")
