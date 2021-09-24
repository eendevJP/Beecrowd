import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int tempo = leitor.nextInt();
        int horas = tempo / 3600;
        int minutos = (tempo - horas * 3600) / 60;
        int segundos = tempo - horas * 3600 - minutos * 60;
        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
    }
}