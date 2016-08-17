package com.loiane.estruturadados.vetor;

public class Vetor {
        
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
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
}
