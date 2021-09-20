import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        double gastoHoras = leitor.nextDouble();
        double velocidadeMedia = leitor.nextDouble();
        double defaultGasto = 12.0;
        double calculo = (gastoHoras * velocidadeMedia) / defaultGasto;
        System.out.println(String.format("%.3f", calculo));
    }
}