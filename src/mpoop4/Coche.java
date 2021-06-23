/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop4;

/**
 *
 * @author USER
 */
public class Coche {
    private String color;
    private String modelo;
    private String marca;
    private int numPuertas;
    private Persona pers1, pers2, pers3, pers4;

    public Coche() {
    }

    public Coche(String color, String modelo, String marca, int numPuertas, Persona pers1, 
            Persona pers2, Persona pers3, Persona pers4) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.numPuertas = numPuertas;
        this.pers1 = pers1;
        this.pers2 = pers2;
        this.pers3 = pers3;
        this.pers4 = pers4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Persona getPers1() {
        return pers1;
    }

    public void setPers1(Persona pers1) {
        this.pers1 = pers1;
    }

    public Persona getPers2() {
        return pers2;
    }

    public void setPers2(Persona pers2) {
        this.pers2 = pers2;
    }

    public Persona getPers3() {
        return pers3;
    }

    public void setPers3(Persona pers3) {
        this.pers3 = pers3;
    }

    public Persona getPers4() {
        return pers4;
    }

    public void setPers4(Persona pers4) {
        this.pers4 = pers4;
    }
    
    
    
    public void encender(){
        System.out.println("Estoy encendiendo"); 
    }
    
    public void apagar(){
        System.out.println("Estoy apagando, bye");
        
    }
    
    public void avanzar(){
        System.out.println("Estoy avanzando rápido");
        
    }
    public void frenar(){
        System.out.println("Estoy frenando, cuidado");   
    }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", modelo=" + modelo + ", marca=" + marca 
             + ", numPuertas=" + numPuertas + ", persona 1=" + pers1 + ", persona 2=" + pers2 
             + ", persona 3=" + pers3 + ", persona 4=" + pers4 + '}';
    }

   
    
    
}
