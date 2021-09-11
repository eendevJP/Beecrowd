import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        double ladoA = leitor.nextDouble();
        double ladoB = leitor.nextDouble();
        double ladoC = leitor.nextDouble();
        double trianguloRetangulo = (ladoA * ladoC/2);
        double circulo = (3.14159 * ladoC * ladoC);
        double trapezio = (((ladoA + ladoB) * ladoC) /2);
        double quadrado = (ladoB * ladoB);
        double retangulo = (ladoA * ladoB);
        System.out.println(String.format("TRIANGULO: %.3f", trianguloRetangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
    }
}