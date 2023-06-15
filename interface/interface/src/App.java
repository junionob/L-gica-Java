public class App {
    public static void main(String[] args) throws Exception {

        Conta cp = new Poupanca();

        cp.depositar(500);
        cp.sacar(20);
        cp.getSaldo();
    }
}
