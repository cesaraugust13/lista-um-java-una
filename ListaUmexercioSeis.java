import java.util.Scanner;

public class ListaUmexercioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        double resultado = Math.log(numeroUm) / Math.log(numeroDois);

        System.out.println("O logaritmo de " + numeroUm + " na base " + numeroDois + " é " + resultado);

        scanner.close();
    }
}
