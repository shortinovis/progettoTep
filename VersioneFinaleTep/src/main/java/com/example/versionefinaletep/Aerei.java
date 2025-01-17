package com.example.versionefinaletep;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Aerei extends Thread{


    private static final int pisteLibere = 3;
    private String agenzia;
    private static final Semaphore piste = new Semaphore(pisteLibere);
    private String stato;

    public Aerei(String agenzia, String stato){
        this.agenzia=agenzia;
        this.stato=stato;
    }
    public void VisualizzazioneStato(){
        for(int i=0; i< ; i++){
            System.out.println();
        }
    }


    public void decolla(){
        try {
        System.out.println("Aereo " + agenzia + " in attesa di una pista per decollare");
        piste.acquire();
        System.out.println("Aereo " + agenzia + " sta decollando");
        try {
            Thread.sleep(5000);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Aereo " + agenzia + " ha decollato");
        piste.release();
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void vola() {
        try {
        int tempoVolo = ThreadLocalRandom.current().nextInt(5000, 10000);
        System.out.println("Aereo " + agenzia + " in volo per " + (tempoVolo / 1000.0) + " secondi");
        try {
            Thread.sleep(tempoVolo);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void atterra() {
        try {
        System.out.println("Aereo " + agenzia + " in attesa di una pista per atterrare");
        piste.acquire();
        System.out.println("Aereo " + agenzia + " sta atterrando");
        try {
            Thread.sleep(5000);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Aereo " + agenzia + " è atterrato");
        piste.release();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public void run() {
        try {
            while (true) {
                decolla();
                vola();
                atterra();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
