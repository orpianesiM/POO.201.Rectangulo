package org.example;

public class Rectangulo {
    private double alto= 1.0;
    private double ancho= 1.0;


    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder(); //Concateno para no imprimilo dentro de la clase
        sb.append("Alto: " + this.alto);
        sb.append("\nAncho: "+ this.ancho);
        return sb.toString();                   //Convertimos a String
    }

    public double calcularArea(){
        double areaRectangulo;
        return areaRectangulo = (this.ancho * this.alto) / 2;
    }

    public double calcularPerimetro(){
        double perimetroRectangulo;
        return perimetroRectangulo = Math.pow(this.alto, 2) + Math.pow(this.ancho, 2);
    }

}
