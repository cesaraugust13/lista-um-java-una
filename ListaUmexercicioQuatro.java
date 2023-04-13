import java.util.Scanner;

public class ListaUmexercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do capital a ser aplicado: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite o prazo de aplicação em meses: ");
        int prazo = scanner.nextInt();

        System.out.print("Digite a taxa de juros mensal (em decimal): ");
        double taxaJuros = scanner.nextDouble();

        double montante = capital * Math.pow(1 + taxaJuros, prazo);

        System.out.printf("O montante a ser recebido é: R$ %.2f", montante);

        scanner.close();
    }
}
