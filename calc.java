
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
        String mod;
        System.out.println("Informe a operação");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("%");
        mod = in.nextLine();
        System.out.println("Informe valor 1");
        v1 = in.nextDouble();
        System.out.println("Informe valor 2");
        v2 = in.nextDouble();
        char op = mod.charAt(0);
        
        if(op == '+'){
            ans = v1 + v2;
            System.out.println(ans);
        } else if(op == '-'){
            ans = v1 - v2;
            System.out.println(ans);
        } else if(op == '*'){
            ans = v1 * v2;
            System.out.println(ans);
        } else if(op == '/'){
            ans = v1 / v2;
            System.out.println(ans);
        } else if(op == '%'){
            ans = v1 % v2;
            System.out.println(ans);
        } 
    }
}