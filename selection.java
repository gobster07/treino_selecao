
/**
 * Escreva uma descrição da classe selection aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class selection
{
    public static void main (String args[]){
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Informe um valor");
        valor = in.nextInt();
        
        if(valor > 0){
            System.out.println("o valor é positivo");
        } else if(valor < 0){
            System.out.println("o valor é negativo");
        } else{
            System.out.println("o valor é nulo");
        }
    }
}