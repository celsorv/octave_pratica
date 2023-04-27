% Define a função
f = @(x, y) sin(sqrt(x.^2 + y.^2))./sqrt(x.^2 + y.^2);

% Cria uma malha de pontos (x, y)
[x, y] = meshgrid(-10:0.1:10);

% Calcula os valores de z = f(x, y) para cada ponto da malha
z = f(x, y);

% Plota o gráfico 3D
figure
surf(x, y, z)
xlabel('x')
ylabel('y')
zlabel('z')
title('Gráfico da função f(x, y) = sin(sqrt(x^2 + y^2))/sqrt(x^2 + y^2)')
