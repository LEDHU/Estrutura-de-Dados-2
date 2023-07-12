package hash;

public class TestHash {
    public static void main(String[] args) {
    
        long start6=System.currentTimeMillis();

        int tamDeVet = 35;

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;


        //vetor original com as chaves
        int[] original = {129, 108, 55, 133, 62, 14, 116, 142, 198, 50, 20, 156, 111, 43, 170, 181, 77, 182, 123, 17, 58, 180, 38, 118, 42, 41, 113, 26, 31, 47, 51, 9, 105, 1, 2}; //35 elemetentos

        //matrizes para armazenar os indexs e as colisoes
        int[][] reHMul = new int[tamDeVet][2];
        int[][] reHDiv = new int[tamDeVet][2];
        int[][] enSMul = new int[tamDeVet][2];
        int[][] enSDiv = new int[tamDeVet][2];

        //os hashs para multiplicaçao e divisao, para as duas categorias de tratamentos
        HashReHashing hash1Mul = new HashReHashing(tamDeVet);
        HashReHashing hash2Div = new HashReHashing(tamDeVet);
        HashEncadeamento hash3Mul = new HashEncadeamento(tamDeVet);
        HashEncadeamento hash4Div = new HashEncadeamento(tamDeVet);

        //adicionando o vetor original aos hashs
        for (int k = 0; k < tamDeVet; k++) {
            //vetores temporarios que iram armazenar os indexs e as colis
            int [] vetTem1 = hash1Mul.putMult(original[k]);
            int [] vetTem2 = hash2Div.putDiv(original[k]);
            int [] vetTem3 = hash3Mul.putMult(original[k]);
            int [] vetTem4 = hash4Div.putDiv(original[k]);

            //passando para as matrizes os indexs e as colis
            for (int i = 0; i < 2; i++){
                reHMul[k][i] = vetTem1[i];
                reHDiv[k][i] = vetTem2[i];
                enSMul[k][i] = vetTem3[i];
                enSDiv[k][i] = vetTem4[i];
            }
        }

        System.out.println("-----------------------------------------Tabela Hash-----------------------------------------");
        System.out.println("\nVetor original");
        for (int i = 0; i < tamDeVet; i++){
            System.out.print(original[i] + " ");
        }

        System.out.println("\nTratamento por re-hashing");

        System.out.println("\nHashing por Multiplicação:                                 Hashing por Divisão: ");
        for (int i = 0; i < tamDeVet; i++){
            System.out.println("Chave: " + original[i] + ". Index: " + reHMul[i][0] + ". Qtd de colisões: " + reHMul[i][1] + "                  Chave: " + original[i] + ". Index: " + reHDiv[i][0] + ". Qtd de colisões: " + reHDiv[i][1]);
            m1 = m1 + reHMul[i][1];
            m2 = m2 + reHDiv[i][1];
        }

        System.out.println("\nTratamento por encadeamento separado");

        System.out.println("\nHashing por Multiplicação:                                 Hashing por Divisão: ");
        for (int i = 0; i < tamDeVet; i++){
            System.out.println("Chave: " + original[i] + ". Index: " + enSMul[i][0] + ". Qtd de colisões: " + enSMul[i][1] + "                  Chave: " + original[i] + ". Index: " + enSDiv[i][0] + ". Qtd de colisões: " + enSDiv[i][1]);
            m3 = m3 + enSMul[i][1];
            m4 = m4 + enSDiv[i][1];
        }

        System.out.println("\nSomatorio de colisoes:");
        System.out.println("\nRe-hashing");
        System.out.println("Multiplicacao: " + m1 + "     divisao: " + m2);
        System.out.println("\nEncadeamento Separado");
        System.out.println("Multiplicacao: " + m3 + "     divisao: " + m4);

        long finalo=System.currentTimeMillis();
        System.out.println();
        System.out.println(finalo - start6 + " milis");
        System.out.println((finalo - start6)/1000 + " segs");
        System.out.println((finalo - start6)/60000 + " min");

        
    }
}
