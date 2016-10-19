/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche primercoche= new Coche();
        Satelite primerSatelite= new Satelite(150,58954,69878);
        primerSatelite.verPosicion();
        Circulo circulo1 =  new Circulo(58);
        System.out.println(circulo1.calculaLongitud());
        System.out.println(circulo1.calcularArea());
    }
    
}
