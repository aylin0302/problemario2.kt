#21. Pendiente y tangente: Grafica una función como y,
#en el mismo gráfico, muestra la recta tangente en un punto dado.

import numpy as np
import matplotlib.pyplot as plt


def f(x):
    return x*4 - 6*x*2 + 3*x

def f_deriv(x):
    return 3*x**2 - 6*x + 12


x_tan = 2


y_tan = f(x_tan)
m_tan = f_deriv(x_tan)


def tangent_line(x):
    return m_tan * (x - x_tan) + y_tan


x = np.linspace(0, 4, 500)
y = f(x)
y_tangent = tangent_line(x)


plt.figure(figsize=(8, 6))
plt.plot(x, y, label="f(x) = $x^3 - 4x^2 + 6x$", color="blue")
plt.plot(x, y_tangent, label=f"Tangente en x={x_tan}", color="orange", linestyle="--")
plt.scatter([x_tan], [y_tan], color="red", label=f"Punto ({x_tan}, {y_tan})")


plt.title("Gráfica de la función y su tangente")
plt.xlabel("x")
plt.ylabel("y")
plt.axhline(0, color="black", linewidth=0.5, linestyle="--")
plt.axvline(0, color="black", linewidth=0.5, linestyle="--")
plt.legend()
plt.grid()


plt.show()
