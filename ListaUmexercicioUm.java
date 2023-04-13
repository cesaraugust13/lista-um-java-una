import java.util.Scanner;

public class ListaUmexercicioUm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        double media = (numeroUm + numeroDois) / 2;

        System.out.println("A média aritmética dos números " + numeroUm + " e " + numeroDois + " é " + media);
        scanner.close();
    }
}
