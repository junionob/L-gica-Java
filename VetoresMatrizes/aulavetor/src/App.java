public class App {
    public static void main(String[] args) throws Exception {
       /* 
       
            *** AULA DE VETORES ***
        
        int[] valor;
        int[] dados = new int[5];

        dados[2] = 9;
        dados[3] = 7;
        dados[0] = 6;

        int multiplica = dados[3] * 2;
    

        
        System.out.println(dados[0]);
        System.out.println(dados[3]);
        System.out.println(dados[2]);
        System.out.println(dados);
         */

        int valor;
        int [][] dados = new int[3][3]; //3 linhas e 3 colunas 

        /*
        ***** início da matriz manualmente***

        dados[0][0] = 1;
        dados[0][1] = 2;
        dados[0][2] = 3;

        dados[1][0] = 1;
        dados[1][1] = 2;
        dados[1][2] = 3;
        */

        //Primeiro for para inserir dados na matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dados[i][j] = j;
            }
        }


        //imprimir itém a itém usando o for (l para linhas e c para Colunas)
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(dados[l][c]);   
            }   
        }
    

        
    }
}
