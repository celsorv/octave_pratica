import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
      
        // Entradas
        int[] x1 = {1, 2, 3, 4, 5};
        int[] x2 = {2, 4, 6, 8, 10};
        int a = 2;
        int[] x = {1, 2, 3, 4, 5};

        // Resultados individuais do sistema para cada entrada separadamente
        int[] y1 = power(x1, 4);
        int[] y2 = power(x2, 4);

        // Resultado do sistema para a soma das entradas
        int[] y_sum = addArrays(y1, y2);

        // Resultados para a entrada multiplicada por "a"
        int[] y1_a = power(x, 4);
        int[] y2_a = power(multiplyArray(a, x), 4);

        // Impressão dos resultados
        System.out.println("Resultados individuais para x1: " + Arrays.toString(y1));
        System.out.println("Resultados individuais para x2: " + Arrays.toString(y2));
        System.out.println("Resultado para a soma das entradas: " + Arrays.toString(y_sum));
        System.out.println("Resultados para x multiplicado por a: " + Arrays.toString(y1_a));
        System.out.println("Resultados para (a * x) multiplicado por a: " + Arrays.toString(y2_a));
    }

    // Função para elevar cada elemento do array a uma potência específica
    public static int[] power(int[] arr, int exp) {
        return Arrays.stream(arr).map(num -> (int) Math.pow(num, exp)).toArray();
    }

    // Função para somar dois arrays elemento por elemento
    public static int[] addArrays(int[] arr1, int[] arr2) {
        return IntStream.range(0, arr1.length).map(i -> arr1[i] + arr2[i]).toArray();
    }

    // Função para multiplicar um array por uma constante
    public static int[] multiplyArray(int constant, int[] arr) {
        return Arrays.stream(arr).map(num -> constant * num).toArray();
    }
  
}
