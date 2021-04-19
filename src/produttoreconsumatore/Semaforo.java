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
public class Semaforo {
    int valore;                          // 0=rosso
    public Semaforo(int v){
    valore=v;
    }
    synchronized public void P(){
    while (valore ==0){                //semaforo rosso
    try {wait();}                      //il thread si sospende
    catch(InterruptedException e){}
    }
    valore--;                          //mette il semaforo rosso
    }
    synchronized public void V(){
    valore++;                          //mette il semaforo verde
    notify();                          //risveglia il thread in coda
    }
}
