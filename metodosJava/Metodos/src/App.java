public class App {

    public static int somar(int a, int b){
        return (a+b);
    }

    //Metodo principal da classe - publico / void: sem retorno;
    public static void main(String[] args) throws Exception {
       int total = App.somar(10, 50);
       System.out.println(total);
    }
}
