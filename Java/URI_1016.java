import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int distanciaCarro = leitor.nextInt();
        int resultadoDistanciaCarro = distanciaCarro * 2;
        System.out.println(String.format("%d minutos", resultadoDistanciaCarro));
    }
}