public class App {
    public static void main(String[] args)  {
        Cachorro c = new Cachorro();
        c.setNome("Bilu");

        Gato g = new Gato();
        g.setNome("Lôla");

        g.mostrar();
        c.mostrar();
    }
}
