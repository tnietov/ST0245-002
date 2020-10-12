import java.util.Scanner;
public class Input
{
    public static String sInput(String msg){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(msg + ": ");
        String valor = teclado.nextLine();
        return valor;
    }
    public static int iInput(String msg){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(msg + ": ");
        int valor = teclado.nextInt();
        return valor;
    }
    public static double dInput(String msg){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(msg + ": ");
        double valor = teclado.nextDouble();
        return valor;
    }
    public static char cInput(String msg){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print(msg + ": ");
        char valor = teclado.next().charAt(0);;
        return valor;
    }
}
