package com.mycompany.exercicio1;

public class Circulo extends FormaGeometrica {

    public Circulo(double altura, double base, double raioCirculo, double areaCirculo, double areaRetangulo) {
        super(altura, base, raioCirculo, areaCirculo, areaRetangulo);
    }

    
    
    
     public void calcularArea(){
        areaCirculo=(22*raioCirculo*raioCirculo)/7;
        System.out.println(areaCirculo);
               
    }
    
}
