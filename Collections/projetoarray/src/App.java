import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("CSharp");
        linguagens.add("Python");
        linguagens.add("Javascript");

        System.out.println("Array list" + linguagens);

        String[] arr = new String[linguagens.size()];

        linguagens.toArray(arr);
        System.out.println("Array: ");

        for(String item:arr) {
            System.out.println(item + ", ");
        }
    }
}
