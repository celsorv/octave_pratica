# Importando a biblioteca numpy para realizar operações vetorizadas
import numpy as np

# Entradas
x1 = np.array([1, 2, 3, 4, 5])
x2 = np.array([2, 4, 6, 8, 10])
a = 2
x = np.array([1, 2, 3, 4, 5])

# Resultados individuais do sistema para cada entrada separadamente
y1 = np.power(x1, 4)
y2 = np.power(x2, 4)

# Resultado do sistema para a soma das entradas
y_sum = y1 + y2

# Resultados para a entrada multiplicada por "a"
y1_a = np.power(x, 4)
y2_a = np.power(a * x, 4)

# Impressão dos resultados
print("Resultados individuais para x1:")
print(y1)
print("Resultados individuais para x2:")
print(y2)
print("Resultado para a soma das entradas:")
print(y_sum)

print("Resultados para x multiplicado por a:")
print(y1_a)
print("Resultados para (a * x) multiplicado por a:")
print(y2_a)
