package com.example.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
		Namorada donaDaRazao = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.adicionarChegadaAniversarianteObserver(donaDaRazao);
		
		porteiro.start();

	}
    
}
