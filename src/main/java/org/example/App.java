package org.example;


public class App 
{
    public static void main( String[] args ) {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println(rectangulo.verDetalle()); //imprimo asi por el metodo que retorna
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());

    }
}
