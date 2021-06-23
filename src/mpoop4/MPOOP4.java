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
public class MPOOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("/*********Practica 4*********/");
        Punto punto = new Punto();
        punto.imprimePunto();
        punto.x=5;
        punto.y=6;
        punto.imprimePunto();
        
        Punto punto2 = new Punto(8,17);
        punto2.imprimePunto();
         
        
        System.out.println("/******************/");
        
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        miCoche.setColor("rojo");
        miCoche.setModelo("Jetta");
        miCoche.setMarca("vw");
        miCoche.setNumPuertas(4);
        System.out.println(miCoche.toString());
        
       // Coche tuCoche= new Coche("negro","fiesta","ford", 5, "Emiliano");
        //System.out.println(tuCoche.toString());
        
        System.out.println("/********************/");
        
        Perro tuPerro = new Perro();
        System.out.println(tuPerro.toString());
        tuPerro.nombre="Zeus";
        tuPerro.raza="chihuahua";
        tuPerro.color="cafe";
        System.out.println(tuPerro.toString());
             
        
        Perro miPerro = new Perro("firulais","pitbull","gris");
        System.out.println(miPerro);
        
        
        
        System.out.println("/*********Practica 5*********/");
        Circulo circ1 = new Circulo();
        System.out.println(circ1);
        //circ1.radio=5;
        circ1.setRadio(5);
        System.out.println(circ1);
        
        circ1.area();
        System.out.println(circ1);
        System.out.println(circ1.perimetro());
        System.out.println(circ1.area());
        
        Circulo cir2 = new Circulo();
        cir2.setRadio(-10);
        System.out.println(cir2);
        System.out.println("Perimetro: "+cir2.perimetro());
        
        System.out.println("/**************************/");
        
        Persona per1 = new Persona();
        per1.setNombre("Isabel");
        per1.setApellido("Hernandez");
        
        Fecha nac = new Fecha();
        nac.setDia(10);
        nac.setMes(6);
        nac.setAnio(1999);
       //per1.setFnacimiento(nac);
        //ystem.out.println(per1); */
   
        
        System.out.println("####EJERCICIO EXTRA######");
        Coche miCarro = new Coche();
        miCarro.setColor("rojo");
        miCarro.setModelo("Jetta");
        miCarro.setMarca("vw");
        miCarro.setNumPuertas(4);
        
        Persona pas1 = new Persona();
        pas1.setNombre("Juan");
        pas1.setApellido("Perez");
        pas1.setLugar("Pasajero 1");
        
        Persona pas2 = new Persona();
        pas2.setNombre("Maria");
        pas2.setApellido("Lopez");
        pas2.setLugar("Pasajero 2");
        
         Persona pil = new Persona();
        pil.setNombre("Pedro");
        pil.setApellido("Hernandez");
        pil.setLugar("Piloto");
        
        Persona cop = new Persona();
        cop.setNombre("Juanita");
        cop.setApellido("Sanchez");
        cop.setLugar("Copiloto");
      
        miCarro.setPers1(pas1);
        miCarro.setPers2(pas2);
        miCarro.setPers3(pil);
        miCarro.setPers4(cop);
        
        System.out.println(miCarro.toString());
    }
    
}
