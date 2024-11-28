#22. Visualización de raíces: Representa gráficamente un polinomio P(x) y
#marca en la gráfica las raíces reales calculadas.

import numpy as np
import matplotlib.pyplot as plt
from numpy.polynomial.polynomial import Polynomial

coefficients = [ -12, 21, -6, 1 ]
P = Polynomial(coefficients)


roots = P.roots()
real_roots = roots[np.isreal(roots)].real


x = np.linspace(-1, 5, 500)
y = P(x)


plt.figure(figsize=(8, 6))
plt.plot(x, y, label="P(x)", color="blue")
plt.axhline(0, color="black", linewidth=0.5, linestyle="--")


for root in real_roots:
    plt.scatter(root, 0, color="red", label=f"Raíz: x={root:.2f}")


plt.title("Visualización de raíces reales de P(x)")
plt.xlabel("x")
plt.ylabel("P(x)")
plt.legend(loc="best")
plt.grid()


plt.show()
