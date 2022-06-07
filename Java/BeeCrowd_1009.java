import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        String nomeVendedor = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double vendasMes = leitor.nextDouble();
        double vendasMesDinheiro = salarioFixo + (15 * vendasMes) / 100;
        System.out.println(String.format("TOTAL = R$ %.2f", vendasMesDinheiro));
    }
}
