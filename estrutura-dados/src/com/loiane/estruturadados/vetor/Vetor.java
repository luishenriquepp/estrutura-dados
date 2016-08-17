package com.loiane.estruturadados.vetor;

public class Vetor {
        
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
        
    public Boolean adiciona(String elemento) {
        
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }
    
    public String busca(int posicao) {
        
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        
        return this.elementos[posicao];
    }
    
    public int tamanho() {
        
        return this.tamanho;
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for (int i=0; i<this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if (this.tamanho>0) {
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }        
}
