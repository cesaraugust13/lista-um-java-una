import java.util.Scanner;

public class ListaUmexercioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco;

        System.out.print("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        double precoComAcrescimo = preco * 1.1;

        System.out.printf("Preço com acréscimo de 10%%: R$ %.2f", precoComAcrescimo);

        scanner.close();

    }
}
