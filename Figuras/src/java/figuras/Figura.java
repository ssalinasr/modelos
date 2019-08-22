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
public abstract class Figura {
    
    private double valor;
    private double area;
    private double perimetro;
    
    public Figura(){
        this.valor = 0;
        this.area = 0;
        this.perimetro = 0;
    }
    
    public void setValor(double v){
        this.valor = v;
    }
    
    public void setArea(double a){
        this.area = a;
    }
        
    public void setPerimetro(double p){
        this.perimetro = p;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double getArea(){
        return this.area;
    }
        
    public double getPerimetro(){
        return this.perimetro;
    }
    
   public abstract double calcularArea(double x);
   public abstract double calcularPerimetro(double x);
         
}
