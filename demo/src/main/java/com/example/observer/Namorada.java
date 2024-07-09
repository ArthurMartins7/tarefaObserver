package com.example.observer;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {

        System.out.println("Por favor, agora podem apagar as luzes!");
		System.out.println("Fiquem quietos! Não façam barulho...");
		System.out.println("AGORA!! SURPRESA!!!");
    }
    
}
