import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.println("Digite um número");
            int n = s.nextInt();
            System.out.println("Número: " + n);
        } catch (Exception ex){
            System.out.println("Erro - valor não é um número");
        }

    }
}
