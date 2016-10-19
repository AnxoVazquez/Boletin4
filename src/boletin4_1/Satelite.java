package boletin4_1;

/**
 *
 * @author avazquezsuarez
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    public Satelite(){
        meridiano=paralelo=distanciaTierra=0;
    }
    
    public Satelite(double m, double p, double dt){
        meridiano=m;
        paralelo=p;
        distanciaTierra=dt;
    }
    
    public void verPosicion(){
        System.out.println("O satelite atopase  no paralelo " + paralelo +" ,no meridano "+ meridiano + " e a unha distancia da terra " + distanciaTierra );
    }
}
