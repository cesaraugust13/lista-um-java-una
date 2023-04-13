import java.util.Scanner;

public class ListaUmexercioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas do vendedor no mês: ");
        double vendasMes = scanner.nextDouble();

        System.out.print("Digite o percentual que o vendedor ganha sobre o total das vendas mensais: ");
        double percentual = scanner.nextDouble();

        double salarioTotal = salarioFixo + (vendasMes * percentual / 100);

        System.out.printf("O salário total do vendedor é R$ %.2f", salarioTotal);

        scanner.close();
    }
}
