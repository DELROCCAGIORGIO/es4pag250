/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produttoreconsumatore;

/**
 *
 * @author Giorgio Del Rocca
 */
public class Produttoreconsumatore {

    protected static int buffer;
    public static void main(String[] args) {
     Semaforo pieno= new Semaforo(0);            //istanzio i due semafori
     Semaforo vuoto=new Semaforo(1);
     ProduciDato prod =new ProduciDato(pieno,vuoto);    //produce un dato e setta il semaforo rosso
     ConsumaDato cons=new ConsumaDato(pieno,vuoto);     //consuma il dato prodotto e risetta il semaforo a verde
     prod.start();
     cons.start();
    System.out.println("Main:termine avvio thread.");
    }
    
}
