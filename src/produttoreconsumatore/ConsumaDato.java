package produttoreconsumatore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giorgio Del Rocca
 */
public class ConsumaDato extends Thread {
    Semaforo pieno;
    Semaforo vuoto;
    int dato;
    public ConsumaDato(Semaforo s1,Semaforo s2){
    pieno=s1;
    vuoto=s2;
    }
    public void run(){
      while(ProduciDato.tanti-1!=dato){
    pieno.P();
    dato=Produttoreconsumatore.buffer;
    System.out.println("lettore: dato letto."+dato);
    vuoto.V();
    }
    }
}
