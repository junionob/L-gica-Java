import java.util.ArrayList;
import java.util.Iterator;


public class App {
    public static void main(String[] args)  {

        //Criando um arrayList: 
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);

        System.out.println("Array List números: " + numeros);

        //Criando uma instância do Iterator

        Iterator<Integer> it = numeros.iterator();

        int numero = it.next();

        System.out.println("Elemento: " + numero);

        while(it.hasNext()){
            it.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
