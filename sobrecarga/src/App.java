class Desenho {


    //método sem parametros
    public void mostra() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");  
        }
    }

    //método com um parametros
    public void mostra(char simb) {
        for (int i = 0; i < 10; i++) {
            System.out.println(simb);  
        }
    }

    //método com dois parâmetros 
    public void mostra(char simb, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(simb);  
        }
    }
}

public class App {

    public static void main(String[] args)  {
        Desenho des = new Desenho();

        des.mostra();
        des.mostra('#');
        des.mostra('@', 3);

    }
}
