package com.example.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    public void adicionarChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner entrada = new Scanner(System.in);

        
        while (true) {
            int valor = entrada.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

                for(ChegadaAniversarianteObserver observer : this.observers) {
                    observer.chegou(event);
                }
            } else {
                System.out.println("Alarme falso!");
            }

        }
    }
}
