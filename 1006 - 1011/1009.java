import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String nome = input.next();
        double salariofixo = input.nextDouble();
        double vendas = input.nextDouble();

        double bonus = vendas * 0.15;

        double salarioTotal = salariofixo + bonus;
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
    }
}
