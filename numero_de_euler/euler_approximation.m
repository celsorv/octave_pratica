n = 1000; % Define o número de iterações para as divisões sucessivas
euler_aprox = 1; % Inicia a aproximação do número de Euler em 1

for i = 1:n
  euler_aprox = euler_aprox + 1/factorial(i); % Realiza a divisão sucessiva
end

fprintf("A aproximação de e com %d iterações é: %f\n", n, euler_aprox); % Imprime a aproximação do número de Euler
