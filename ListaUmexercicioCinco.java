import java.util.Scanner;

public class ListaUmexercicioCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Obtém o número de horas trabalhadas no mês
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int numHoras = sc.nextInt();

        // Obtém o valor recebido por hora de trabalho
        System.out.print("Digite o valor recebido por hora de trabalho: ");
        double valorHora = sc.nextDouble();

        // Obtém o número de filhos com idade menor que 14 anos
        System.out.print("Digite o número de filhos com idade menor que 14 anos: ");
        int numFilhos = sc.nextInt();

        // Obtém o valor do salário família
        System.out.print("Digite o valor do salário família: ");
        double salarioFamilia = sc.nextDouble();

        // Calcula o salário bruto
        double salarioBruto = numHoras * valorHora;

        if (numFilhos > 0) {
            salarioBruto += numFilhos * salarioFamilia;
        }

        // Imprime o salário bruto
        System.out.println("O salário bruto a ser recebido é: R$" + salarioBruto);

        sc.close();
    }
}
