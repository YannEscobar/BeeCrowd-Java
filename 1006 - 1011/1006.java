import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double A = input.nextDouble();
    double B = input.nextDouble();
    double C = input.nextDouble();
    double medNotas = (A * 2 + B * 3 + C * 5) / 10.0;
    System.out.printf("MEDIA = %.1f\n", medNotas);
    input.close();
    }
}
