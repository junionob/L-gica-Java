public class App {
    public static void main(String[] args)  {
        Pessoa p = new Pessoa();

        p.nome = "Luiz";
        vendedor v = new vendedor();
        v.nome = "André";
        v.comissao = 8.6;

        System.out.println("O vendedor " + v.nome + " Tem comissao de " + v.comissao);





    }
}
