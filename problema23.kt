#23. Simulación de ondas: Dibuja la superposición de dos ondas.

import numpy as np
import matplotlib.pyplot as plt


A1, A2 = 2, 1.18
f1, f2 = 1, 1.2
phi1, phi2 = 0, np.pi / 4


t = np.linspace(0, 10, 1000)


wave1 = A1 * np.sin(2 * np.pi * f1 * t + phi1)
wave2 = A2 * np.sin(2 * np.pi * f2 * t + phi2)


superposition = wave1 + wave2


plt.figure(figsize=(10, 6))

plt.plot(t, wave1, label="Onda 1", color="blue", alpha=0.6)
plt.plot(t, wave2, label="Onda 2", color="green", alpha=0.6)
plt.plot(t, superposition, label="Superposición", color="red", linestyle="--")


plt.title("Simulación de la superposición de dos ondas")
plt.xlabel("Tiempo (t)")
plt.ylabel("Amplitud")
plt.legend()
plt.grid()


plt.show()
