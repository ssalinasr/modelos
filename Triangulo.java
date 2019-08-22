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
public class Triangulo extends Figura {
    
    public Triangulo(){
  
    }

    @Override
    public double calcularArea(double x) {
        double area = (x*(x+1))/2;
        this.setArea(area);
        return area;
    }

    @Override
    public double calcularPerimetro(double x) {
        double per = x*3;
        this.setPerimetro(per);
        return per;
    }

}
