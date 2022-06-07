import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int codigoPeca1 = leitor.nextInt();
        int numeroPeca1 = leitor.nextInt();
        double valorPeca1 = leitor.nextDouble();
        int codigoPeca2 = leitor.nextInt();
        int numeroPeca2 = leitor.nextInt();
        double valorPeca2 = leitor.nextDouble();
        double valorFinal = (numeroPeca1 * valorPeca1 + numeroPeca2 * valorPeca2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorFinal));
    }
}
