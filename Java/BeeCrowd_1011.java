import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();
        double volume = ((4/3.0) * 3.14159 * raio*raio*raio);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
