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
public class Punto {
    int x,y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void imprimePunto(){
        System.out.println("X="+x+" Y="+y);
          
    }
}
