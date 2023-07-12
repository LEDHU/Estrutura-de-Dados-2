package br.unicap.ed2;

public class Heap {
    private int [] vetor;

    public Heap(int [] vetor){
        this.vetor = vetor;
    }

    public int[] getVetor(){
        return vetor;
    }
    
    public void sort(){
        BinaryHeap bh = new BinaryHeap(vetor.length);
        for (int i = 0 ; i < vetor.length; i++) {
          bh.insertInHeap(vetor[i]);
        }
    
        for(int i=0; i<vetor.length; i++) {
          vetor[i] = bh.extractHeadOfHeap();
        }
    }
}
