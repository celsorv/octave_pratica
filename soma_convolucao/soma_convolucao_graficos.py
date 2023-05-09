import numpy as np
import matplotlib.pyplot as plt

# Sequência x[n]
n_x = np.arange(-5, 6)
x = 2 * (n_x == -1) + 3 * (n_x == 0) + 5 * (n_x == -2)

# Sequência h[n]
n_h = np.arange(-5, 6)
h = 4 * (n_h == -1) + 2 * (n_h == -2)

# Soma de convolução
y = np.convolve(x, h)

# Eixo x para o resultado da convolução
n_y = np.arange(n_x[0] + n_h[0], n_x[-1] + n_h[-1] + 1)

# Plot dos gráficos
plt.figure(figsize=(8, 10))

plt.subplot(3, 1, 1)
plt.stem(n_x, x)
plt.xlabel('n')
plt.ylabel('x[n]')
plt.title('Gráfico de x[n]')

plt.subplot(3, 1, 2)
plt.stem(n_h, h)
plt.xlabel('n')
plt.ylabel('h[n]')
plt.title('Gráfico de h[n]')

plt.subplot(3, 1, 3)
plt.stem(n_y, y)
plt.xlabel('n')
plt.ylabel('y[n]')
plt.title('Gráfico de y[n]')

plt.tight_layout()
plt.show()
