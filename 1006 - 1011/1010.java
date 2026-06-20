import java.io.IOException;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int codPeca = input.nextInt();
    int quantPeca = input.nextInt();
    double valorPeca = input.nextDouble();
    
    int codPeca2 = input.nextInt();
    int quantPeca2 = input.nextInt();
    double valorPeca2 = input.nextDouble();
    
    double valorTotal = quantPeca * valorPeca + quantPeca2 * valorPeca2;
    
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    
    
    input.close();
    }
 
}
