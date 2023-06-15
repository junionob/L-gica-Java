import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 99) {
            System.out.println("Digite uma opção ou 99 para sair.");
            opcao = teclado.nextInt();
        }
        System.out.println("operação finalizada!!!");
    }    
}
