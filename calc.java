
/**
 * Escreva uma descrição da classe calc aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
import java.lang.Package;
public class calc
{
   public static void main(String args[]){
        System.out.print('\u000C');
        
        Scanner in = new Scanner(System.in);
        
        double v1, v2, ans;
        int op;
        
        System.out.println("Informe a operação");
        System.out.println(" 1 = +");
        System.out.println(" 2 = -");
        System.out.println(" 3 = *");
        System.out.println(" 4 = /");
        System.out.println(" 5 = %");
        op = in.nextInt();
        System.out.println("Informe valor 1");
        v1 = in.nextDouble();
        System.out.println("Informe valor 2");
        v2 = in.nextDouble();
        
        
        if(op == 1){
            ans = v1 + v2;
            System.out.println(ans);
        } else if(op == 2){
            ans = v1 - v2;
            System.out.println(ans);
        } else if(op == 3){
            ans = v1 * v2;
            System.out.println(ans);
        } else if(op == 4){
            ans = v1 / v2;
            System.out.println(ans);
        } else if(op == 5){
            ans = v1 % v2;
            System.out.println(ans);
        } 
    }
}