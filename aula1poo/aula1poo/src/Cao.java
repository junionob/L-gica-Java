public class Cao {
    String nome;
    String cor;
    int idade;
    double peso;
    
    //Construtores
    public Cao(){
        cor = "Caramelo";
    }
    
    //This => Variável local
    public Cao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos
    private void Anda(){
        System.out.println("Estou andando..." + cor);
    }

    private void DadosCao(){
        System.out.println(nome + " " + idade);
    }
}
