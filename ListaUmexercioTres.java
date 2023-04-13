import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // leitura da temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // conversão para Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // exibição do resultado
        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
