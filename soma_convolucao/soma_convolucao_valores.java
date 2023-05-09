import java.util.Arrays;

public class SomaConvolucaoValores {

    public static double[] somaConvolucao(double[] sinalEntrada, double[] sinalRespostaImpulso) {

        int tamanhoEntrada = sinalEntrada.length;
        int tamanhoRespostaImpulso = sinalRespostaImpulso.length;
        int tamanhoResultante = tamanhoEntrada + tamanhoRespostaImpulso - 1;

        double[] sinalResultante = new double[tamanhoResultante];

        for (int i = 0; i < tamanhoResultante; i++) {
            sinalResultante[i] = 0;

            // Iterar sobre todos os pontos de sobreposição
            for (int j = 0; j < tamanhoRespostaImpulso; j++) {
                int indiceEntrada = i - j;

                // Verificar se o índice está dentro dos limites do sinal de entrada
                if (indiceEntrada >= 0 && indiceEntrada < tamanhoEntrada) {
                    // Multiplicar e acumular os valores do sinal de entrada e resposta ao impulso
                    sinalResultante[i] += sinalEntrada[indiceEntrada] * sinalRespostaImpulso[j];
                }
            }

        }

        return sinalResultante;

    }

    public static void main(String[] args) {

        // Exemplo de sinais para soma de convolução
        double[] somElefante = {0.5, 0.8, 1.0, 0.7, 0.3}; // Simulação simplificada do som do elefante
        double[] respostaGarrafa = {0.1, 0.5, 0.8, 0.5, 0.1}; // Simulação simplificada da resposta ao impulso da garrafa

        // Chamada da função de soma de convolução
        double[] resultado = somaConvolucao(somElefante, respostaGarrafa);

        // Exibição do resultado
        System.out.println("Sinal resultante da soma de convolução:");
        Arrays.stream(resultado).forEach(System.out::println);

    }
}
