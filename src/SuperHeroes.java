/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */

import java.util.Random;

public class SuperHeroes {
    
    String nombre;
    int vida;
    int minPower;
    int maxPower;
    
    public SuperHeroes(String nombre, int vida, int minPower, int maxPower){
    
    this.nombre = nombre;
    this.vida = vida;
    this.minPower = minPower;
    this.maxPower = maxPower;
    
    
    }
    
    public static int calcularGolpe(){
    
        Random oleatorio = new Random();
        
        int n = oleatorio.nextInt(10);
    
        return n;
    }
    
}
