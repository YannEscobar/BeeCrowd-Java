import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int prodAB = A * B;
        int prodCD = C * D;
        int diferenca = prodAB - prodCD;

        System.out.println("DIFERENCA = " + diferenca);
        
        input.close();
    }
}
