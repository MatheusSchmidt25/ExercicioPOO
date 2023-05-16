package com.mycompany.exercicio1;

public class Retangulo extends FormaGeometrica{

    public Retangulo(double altura, double base, double raioCirculo, double areaCirculo, double areaRetangulo) {
        super(altura, base, raioCirculo, areaCirculo, areaRetangulo);
    }

    

    
    
    
    public void calcularArea(){
        areaRetangulo=base*altura;
        System.out.println(areaRetangulo);
               
    }
}
