import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double pi = 3.14159;
        double cubo = Math.pow(raio, 3);
        double vol = 4.0/3.0 * pi * cubo;
        
        System.out.printf("VOLUME = %.3f\n", vol); 
        
        input.close();
    }
}
