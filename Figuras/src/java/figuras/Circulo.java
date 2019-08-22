/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author estudiantes
 */
public class Circulo extends Figura {
    
    public Circulo(){
 
    }

    @Override
    public double calcularArea(double x) {
        double area = Math.PI*Math.pow(x, 2);
        this.setArea(area);
        return area;
    }

    @Override
    public double calcularPerimetro(double x) {
        double per = 2*Math.PI*x;
        this.setPerimetro(per);
        return per;
    }
    
    


    
}
