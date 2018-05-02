/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticohibrido;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ManagerGeneticos {
    
    private ArrayList<GeneticoHilo> geneticos;

    public ManagerGeneticos(int numGeneticos) {
        /// proceso iterativo para la creacion de los geneticos
    }
    
    public void intercambiarIndividuos(int origen,int destino){
     // el criterio de intercambio es el primero
     GeneticoHilo destinoGen =  this.geneticos.get(destino);
     GeneticoHilo origenGen = this.geneticos.get(origen);
     destinoGen.setIndividuo(origenGen.getInividuo(0));
    }
    
    public void cambiarMuta(int destino, Double muta){
    GeneticoHilo destinoGen =  this.geneticos.get(destino);
    destinoGen.setProbMuta(muta);
    }
    
    // TODO: MODIFCAR OPERADORES 
    public void ejecutar(){
        Thread auxHilo;
        // proceso iterativo para la asignacion de los hilos y su ejecución
        for (int x=0; x< this.geneticos.size();x++){
         auxHilo = new Thread(this.geneticos.get(x));
         auxHilo.start();
        }
    
    }
    
}
