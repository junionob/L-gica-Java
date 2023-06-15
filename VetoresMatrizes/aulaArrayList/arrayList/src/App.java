import java.util.ArrayList;

public class App {
    public static void main(String[] args)  {

        /* 
        ArrayList<String> estados = new ArrayList<>();
        
        //adicionar no array
        estados.add("São Paulo");
        estados.add("Rio de Janeiro");
        estados.add("Goiás");
        estados.add("Ceará");
        estados.add("Pernanbuco");
        estados.add("Distrito Federal");


        //remover do Array
        estados.remove("Distrito Federal");

        //pesquisar no array
        estados.contains("Amazônas");


    }*/

        ArrayList<String> bandas = new ArrayList<>();

        bandas.add("Beatles");
        bandas.add("Scorpions");
        bandas.add("Kiss");
        bandas.add("Paralams do Sucesso");

        System.out.println(bandas);


        //no indice da banda kiss [2], troca pela banda Gun's;
        bandas.add(bandas.indexOf("Kiss"), "Gun's and Roses");
        System.out.println(bandas);


        //Remove a banda kiss do Array
        bandas.remove("Kiss");
        System.out.println(bandas);

        //Limpa o array List
        bandas.clear();
        System.out.println(bandas)



    }
}
