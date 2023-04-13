import java.util.Scanner;

public class ListaUmexercioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de veículos no estacionamento: ");
        int totalVeiculos = scanner.nextInt();

        System.out.print("Digite o total de rodas no estacionamento: ");
        int totalRodas = scanner.nextInt();

        int qtdCarros = 0;
        int qtdMotos = 0;

        // Para cada veículo, o algoritmo verifica se é um carro ou moto
        for (int i = 1; i <= totalVeiculos; i++) {
            System.out.print("Digite o número de rodas do veículo " + i + ": ");
            int qtdRodas = scanner.nextInt();

            if (qtdRodas == 4) {
                qtdCarros++;
            } else if (qtdRodas == 2) {
                qtdMotos++;
            } else {
                System.out.println("Veículo inválido! Não foi possível identificar se é um carro ou moto.");
            }
        }

        // Verifica se a quantidade de rodas informada bate com o total informado pelo
        // usuário
        if (totalRodas != (qtdCarros * 4 + qtdMotos * 2)) {
            System.out.println(
                    "Erro! A quantidade de rodas informada não corresponde ao número total de veículos informado.");
            System.exit(0);
        }

        // Apresenta o resultado para o usuário
        System.out.println("O estacionamento possui " + qtdCarros + " carros e " + qtdMotos + " motos.");
        scanner.close();

    }
}
