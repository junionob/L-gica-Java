import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite uma opção ou 99 para sair.");
            opcao = entrada.nextInt();
        } while (opcao != 99); //DO/WHILE declara primeiro o que deve fazer e depois verifica a condição

        System.out.println("OPERAÇÃO FINALIZADA!");
    }
}
