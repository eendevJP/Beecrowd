import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int notaUser = leitor.nextInt();
        int notaAtual = notaUser;
        int notas100 = notaAtual / 100;
        notaAtual -= notas100 * 100;
        int notas50 = notaAtual / 50;
        notaAtual -= notas50 * 50;
        int notas20 = notaAtual / 20;
        notaAtual -= notaAtual * 20;
        int notas10 = notaAtual / 10;
        notaAtual -= notaAtual * 10;
        int notas5 = notaAtual / 5;
        notaAtual -= notaAtual * 5;
        int notas2 = notaAtual / 2;
        notaAtual -= notaAtual * 2;
        int notas1 = notaAtual;

        System.out.println(notaUser);
        System.out.println(String.format(notas100 + "nota(s) de R$ 100,00"));
        System.out.println(String.format(notas50 + "nota(s) de R$ 50,00"));
        System.out.println(String.format(notas20 + "nota(s) de R$ 20,00"));
        System.out.println(String.format(notas10 + "nota(s) de R$ 10,00"));
        System.out.println(String.format(notas5 + "nota(s) de R$ 5,00"));
        System.out.println(String.format(notas2 + "nota(s) de R$ 2,00"));
        System.out.println(String.format(notas1+ "nota(s) de R$ 1,00"));
    }
}