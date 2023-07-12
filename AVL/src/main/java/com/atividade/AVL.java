package com.atividade;

public class AVL {
    No raiz;

    public boolean isEmpty(){
        return this.raiz == null;
    }

    public int getAltura(No no) {
        if (no == null) return -1;
        return no.altura;
    }

    public void put(Integer chave) {
        this.raiz = insertNo(raiz, chave);
    }

    private No insertNo(No no, Integer noChave) {
        if (no == null) return new No(noChave);

        else if (noChave < no.chave)
            no.esquerda = insertNo(no.esquerda, noChave);

        else
            no.direita = insertNo(no.direita, noChave);

        no.altura = 1 + Math.max(getAltura(no.esquerda), getAltura(no.direita));
        int valor = balancear(no);

        //direita
        if (valor < -1 && noChave < no.esquerda.chave)
            return rotacaoDireita(no);

        //esquerda
        if (valor > 1 && noChave > no.direita.chave)
            return rotacaoEsquerda(no);

        //esquerda direita(LR)
        if (valor < -1 && noChave > no.esquerda.chave) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        //direita esquerda(RL)
        if (valor > 1 && noChave < no.direita.chave) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public int balancear(No no) {
        if (no == null) return 0;
        return getAltura(no.direita) - getAltura(no.esquerda);
    }

    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        y.esquerda = y.esquerda.direita;
        x.direita = y;
        y.altura = 1 + Math.max(getAltura(y.esquerda), getAltura(y.direita));
        x.altura = 1 + Math.max(getAltura(x.esquerda), getAltura(x.direita));
        return x;
    }

    private No rotacaoEsquerda(No y) {
        No x = y.direita;
        y.direita = y.direita.esquerda;
        x.esquerda = y;
        y.altura = 1 + Math.max(getAltura(y.esquerda), getAltura(y.direita));
        x.altura = 1 + Math.max(getAltura(x.esquerda), getAltura(x.direita));
        return x;
    }

    public static No Max(No raiz){
        if(raiz.direita == null) return raiz;
        else return Max(raiz.direita);
    }

    public void deletar(Integer chave) {
        this.raiz = delete(raiz, chave);
    }

    public No delete(No no, Integer chave) {
        if (no == null) return null;

        if (chave < no.chave)
            no.esquerda = delete(no.esquerda, chave);
        else if (chave > no.chave)
            no.direita = delete(no.direita, chave);
        else {
            if (no.esquerda != null && no.direita != null) {
                No maximoNoParaEsquerda = Max(no.esquerda);
                no.chave = maximoNoParaEsquerda.chave;
                no.esquerda = delete(no.esquerda, maximoNoParaEsquerda.chave);
            }

            else if (no.esquerda != null) no = no.esquerda;
            else if (no.direita != null) no = no.direita;
            else no = null;

        }
        int valor = balancear(no);
        //LL
        if (valor < -1) {
            assert no != null;
            if (balancear(no.esquerda) <= 0)
                return rotacaoDireita(no);
        }

        //RR
        if (valor > 1) {
            assert no != null;
            if (balancear(no.direita) >= 0)
                return rotacaoEsquerda(no);
        }

        //LR
        if (valor < -1 && balancear(no.esquerda) > 0){
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        //RL
        if (valor > 1 && balancear(no.direita) < 0) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void preOrdem(){
        if(!this.isEmpty())
            percorrerPreOrdem(this.raiz);
    }

    private void percorrerPreOrdem(No r){
        if(r != null){
            System.out.println("chave " + r.chave + " altura "+ r.altura);
            percorrerPreOrdem(r.esquerda);
            percorrerPreOrdem(r.direita);
        }
    }
}