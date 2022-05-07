import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int funcionarioNumber = leitor.nextInt();
        int horasTrabalhadas = leitor.nextInt();
        double horaSalario = leitor.nextDouble();
        double salario =  horasTrabalhadas * horaSalario;
        System.out.println(String.format("NUMBER = %d", funcionarioNumber));
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
}
