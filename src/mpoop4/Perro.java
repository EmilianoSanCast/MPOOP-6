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
public class Perro {
    String nombre;
    String raza;
    String color;

    public Perro() {
    }
    
    
    public Perro(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
    
    public void comer(){
            System.out.println("*come");
}
    public void dormir(){
        System.out.println("ZZZZZZZZZ");
    }
    public void ladrar(){
        System.out.println("¡waaauff!");
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
    
}
