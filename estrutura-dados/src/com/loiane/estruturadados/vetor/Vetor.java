package com.loiane.estruturadados.vetor;

public class Vetor {
        
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    
//    public void adiciona(String elemento) {
//        for (int i=0; i<this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }
    
    public Boolean adiciona(String elemento) {
        
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
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
