% Entradas
x1 = [1, 2, 3, 4, 5];
x2 = [2, 4, 6, 8, 10];
a = 2;
x = [1, 2, 3, 4, 5];

% Resultados individuais do sistema para cada entrada separadamente
y1 = x1.^4;
y2 = x2.^4;

% Resultado do sistema para a soma das entradas
y_sum = y1 + y2;

% Resultados para a entrada multiplicada por "a"
y1_a = x.^4;
y2_a = (a * x).^4;

% Impressão dos resultados
disp("Resultados individuais para x1:");
disp(y1);
disp("Resultados individuais para x2:");
disp(y2);
disp("Resultado para a soma das entradas:");
disp(y_sum);

disp("Resultados para x multiplicado por a:");
disp(y1_a);
disp("Resultados para (a * x) multiplicado por a:");
disp(y2_a);
