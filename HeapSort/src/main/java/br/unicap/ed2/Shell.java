package br.unicap.ed2;

public class Shell {
    private int[] vetor;
    private int[] h;


    public Shell(int[] vetor, int[] h){
        this.vetor = vetor;
        this.h = h;
    }

    public int[] getVetor(){
        return vetor;
    }

public void sort() {
        //i refere-se ao tamanho de H
        //j refere-se a quantidade de grupos
        //k é do vetor grande para o vetor pequeno
        //l é do vetor pequeno para o vetor grande
        for(int i = h.length - 1; i >= 0; i--){
            int[] v = new int[Math.floorDiv(vetor.length,h[i])];

            for(int j = 0 ;j < h[i]; j++){

                int m = 0;
                for(int k = 0; k < vetor.length; k += h[i]){
                    v[m] = vetor[k+j];
                    m++;
                }

                v = insertionSort(v);

                int n = 0;
                for(int l = 0; l < vetor.length; l += h[i]){
                    vetor[l+j] = v[n];
                    n++;
                }
            }
        }
    }

    public int[] insertionSort (int[] vet){
        int i, j, x;
        for (i = 1; i < vet.length; i++){
            x = vet[i];
            j = i - 1;
            while (j >= 0 && x < vet[j]){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = x;
        }
        return vet;
    }
}
