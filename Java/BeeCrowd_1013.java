import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(String.format("%d eh o maior", num1));
        } else if (num2 > num3){
            System.out.println(String.format("%d eh o maior", num2));
        } else{
            System.out.println(String.format("%d eh o maior", num3));
        }
    }
}
