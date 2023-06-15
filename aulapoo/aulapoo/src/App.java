import java.io.NotActiveException;

public class App {
    public static void main(String[] args)  {
       Cao cachorro = new Cao();

       cachorro.setIdade(5);

       if(cachorro.VerificarIdade()){
        System.out.println("Ele é idoso");
       } else{
        System.out.println("Novinho");
       }
    }
}
