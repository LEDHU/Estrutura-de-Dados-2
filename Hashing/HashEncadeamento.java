package hash;

public class HashEncadeamento {
    private final AVL[] tree ;
    private final int tam;

    public HashEncadeamento(int tam) {
        tree = new AVL[tam];
        this.tam = tam;
        for(int i = 0; i < tam; i++){
            tree[i] = new AVL();
        }
    }

    private int hashingMult(int chave) {
        double fibo = (Math.sqrt(5) - 1) / 2;
        double mult = chave * fibo;
        double decs = mult % 1;
        return (int) Math.floor(tam * decs);
    }

    private int hashingDiv(int chave) {
        return chave % tam;
    }

    public int[] putMult(int chave){
        //retorna o index a quantidade de colisao de mul
        int [] vet = new int[2];
        int hashing = hashingMult(chave);
        int x = 1;

        //se a tree tiver vazia nao ha colisao, mas se nao estiver ha apenas uma colisao
        if(tree[hashing].isEmpty()){
            x = 0;
        }
        tree[hashing].put(chave);
        vet[0] = hashing;
        vet[1] = x;

        return vet;

    }

    public int[] putDiv(int chave){
        //retorna o index a quantidade de colisao de div
        int [] vet = new int[2];
        int hashing = hashingDiv(chave);
        int x = 1;
        if(tree[hashing].isEmpty()){
            x = 0;
        }
        tree[hashing].put(chave);
        vet[0] = hashing;
        vet[1] = x;

        return vet;
    }

    public boolean[] buscar (int chave){
        //multiplicao, divisao
        boolean [] vet = {false, false};
        int hashDiv = hashingDiv(chave);
        int hashMul = hashingMult(chave);

        if (tree[hashMul].busca(chave)) vet[0] = true;
        if (tree[hashDiv].busca(chave)) vet[1] = true;

        return vet;
    }

}