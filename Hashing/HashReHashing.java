package hash;

public class HashReHashing {
    private final int[] vetorArray;
    private int qtd;
    private int colisao;
    private final int tam;

    public HashReHashing(int tam) {
        vetorArray = new int[tam];
        this.qtd = 0;
        this.colisao = 0;
        this.tam = tam;
    }

    public boolean isFullArray() {
        return vetorArray.length == qtd;
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

    private int rehashing(int i) {
        return (i + 1) % tam;
    }

    public int[] putMult(int chave) {
        //retorna o index a quantidade de colisao de mul
        int [] vet = new int[2];
        int hashing = hashingMult(chave);

        if (!isFullArray()) {
            int coli = 0;
            while(vetorArray[hashing] != 0){
                hashing = rehashing(hashing);
                coli++;
            }
            vetorArray[hashing] = chave;
            qtd++;
            colisao = colisao + coli;
            vet[0] = hashing;
            vet[1] = coli;
            return vet;
        }
        return vet;
    }

    public int[] putDiv(int chave) {
        //retorna o index a quantidade de colisao de div
        int [] vet = new int[2];
        int hashing = hashingDiv(chave);

        if (!isFullArray()) {
            int coli = 0;
            while(vetorArray[hashing] != 0){
                hashing = rehashing(hashing);
                coli++;
            }
            vetorArray[hashing] = chave;
            qtd++;
            colisao = colisao + coli;
            vet[0] = hashing;
            vet[1] = coli;
            return vet;
        }
        return vet;
    }

    public int[] buscar(int chave) {
        //retorna o index a quantidade de colisao de mult e o index a quantidade de colisao de div, respectivamente
        int [] vetorColi = new int[4];
        int hashDiv = hashingDiv(chave);
        int hashMul = hashingMult(chave);
        int coli = 0;

        while (vetorArray[hashMul] != 0) {
            if(vetorArray[hashMul] == chave){
                vetorColi[0] = hashMul;
                vetorColi[1] = coli;
                break;
            }
            coli++;
            hashMul = rehashing(hashMul);
        }
        coli = 0;

        while (vetorArray[hashDiv] != 0) {
            if(vetorArray[hashDiv] == chave){
                vetorColi[2] = hashDiv;
                vetorColi[3] = coli;
                break;
            }
            coli++;
            hashDiv = rehashing(hashDiv);
        }

        return vetorColi;
    }
}
