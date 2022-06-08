import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int distanciaPercorrida = leitor.nextInt();
        double combustivel = leitor.nextDouble();
        double gasto = distanciaPercorrida / combustivel;
        System.out.println(String.format("%.3f km/l", gasto ));
    }
}
