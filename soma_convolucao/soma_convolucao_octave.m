% Sequência x[n]
n_x = -5:5;
x = 2 * (n_x == -1) + 3 * (n_x == 0) + 5 * (n_x == -2);

% Sequência h[n]
n_h = -5:5;
h = 4 * (n_h == -1) + 2 * (n_h == -2);

% Soma de convolução
n_y = n_x(1) + n_h(1):n_x(end) + n_h(end);
y = conv(x, h);

% Plot dos gráficos
figure;

subplot(3, 1, 1);
stem(n_x, x);
xlabel('n');
ylabel('x[n]');
title('Gráfico de x[n]');

subplot(3, 1, 2);
stem(n_h, h);
xlabel('n');
ylabel('h[n]');
title('Gráfico de h[n]');

subplot(3, 1, 3);
stem(n_y, y);
xlabel('n');
ylabel('y[n]');
title('Gráfico de y[n]');

% Ajustar o espaçamento entre os subplots
subplot(3, 1, 1);
ylim([0 max(x)+1]);
subplot(3, 1, 2);
ylim([0 max(h)+1]);
subplot(3, 1, 3);
ylim([0 max(y)+1]);

% Ajustar o tamanho da figura
fig = gcf;
fig.Position(3:4) = [600 800];
