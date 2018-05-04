/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticohibrido;

import geneticohibrido.entidades.Individuo;
import geneticohibrido.entidades.Poblacion;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoHilo implements Runnable{

    // flag de ejecución
    private boolean run;
    private Poblacion pobActual;
    private Double probMuta;
    // numero de generaciones 
    //

    public GeneticoHilo(Double probMuta ) {
        this.probMuta = probMuta;
    }
    
    public void setIndividuo(Individuo ind){
        if (this.pobActual != null)
        this.pobActual.getPoblacion().add(ind);
    }
    public Individuo getInividuo(int x){
    Individuo aux = null;
    if (this.pobActual != null){
        aux = new Individuo(this.pobActual.getPoblacion().get(x));
    }
    return aux;
    }
       
    public void evolucionar() {
      // implementación del genétio
      // se genera la población inicial (aleatoria
      
      do{
       // se va construir una nueva población 
       // muestreo
       // aplican sus operadores 
      
      
      } while(this.run);
      
      
    }

    @Override
    public void run() {
        this.run = true;
        evolucionar();
        this.run = false;
    }

    /**
     * @return the probMuta
     */
    public Double getProbMuta() {
        return probMuta;
    }

    /**
     * @param probMuta the probMuta to set
     */
    public void setProbMuta(Double probMuta) {
        this.probMuta = probMuta;
    }
    
}
