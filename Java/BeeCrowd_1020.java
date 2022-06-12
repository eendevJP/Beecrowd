import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        int idadeAnos = idade/ 365;
        int idadeMeses = (idade % 365) / 30;
        int idadeDias = (idade % 365) % 30;
        System.out.println(String.format("%d ano(s)", idadeAnos));
        System.out.println(String.format("%d mes(es)",idadeMeses));
        System.out.println(String.format("%d dia(s)", idadeDias));
    }
}
