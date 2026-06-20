import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
    Scanner input = new Scanner(System.in);
    int numb = input.nextInt();
    int horas = input.nextInt();
    double trabalhadas = input.nextDouble();
    double salary = horas * trabalhadas;
    
    System.out.println("NUMBER = " + numb);
    System.out.printf("SALARY = U$ %.2f\n", salary);
    }
 
}
