import java.util.Scanner;

public class ListaUmexercioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("%d segundos equivalem a %d horas, %d minutos e %d segundos.", totalSegundos, horas, minutos,
                segundos);
        scanner.close();
    }
}
