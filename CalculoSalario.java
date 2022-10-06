import java.util.Scanner;
public class CalculoSalario {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu ganho por hora?:");
        double ganho = scanner.nextDouble();
        System.out.println("Quantas horas você trabalhou esse mês?:");
        double horas = scanner.nextDouble();
        double salario = ganho*horas;
        System.out.println("Seu ganho total foi igual a: "+ salario+".");
    }
}
