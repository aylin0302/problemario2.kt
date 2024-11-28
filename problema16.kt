#16. Raíces de polinomios: Diseña un programa que encuentre todas las raíces
#reales de un polinomio de tercer grado.

import numpy as np

def raicespolinomio(coeficientes):
    return np.roots(coeficientes)

#Ejemplo:
coeficientes = [1, -3, 4]  # x³ - 3x² + 4 
print("Raíces reales del polinomio:", raicespolinomio(coeficientes))
