import java.util.Scanner;

public class ListaUmexercioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor:");
        double valor3 = scanner.nextDouble();

        double mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        double mediaHarmonica = 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));
        double mediaGeometrica = Math.pow((valor1 * valor2 * valor3), (1.0 / 3));

        System.out.println("Média Aritmética: " + mediaAritmetica);
        System.out.println("Média Harmônica: " + mediaHarmonica);
        System.out.println("Média Geométrica: " + mediaGeometrica);
        scanner.close();
    }
}
