import java.util.LinkedList;

public class App {  
    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<>();

        animais.add("Cachorro");
        animais.add("Cavalo");
        animais.add("Vaca");

        System.out.println("Linkedlist: " + animais);

        animais.add(1, "Gato");
        System.out.println("Linkedlist: " + animais);
    }
}
