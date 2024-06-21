package com.example.observer;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {

        System.out.println("Agora pode apagar as luzes!");
		System.out.println("Não façam barulho...");
		System.out.println("SURPRESA!!!");
    }
    
}
