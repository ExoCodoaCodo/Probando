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

public class Principal {
    
    
    public static boolean siguenVivos(int vidaG, int vidaS){
        
    return vidaG > 0 && vidaS > 0;
    }
    
    public static void main (String [] args){
        
    
   
    
    SuperHeroes goku = new SuperHeroes("Goku",100,12,15);
    SuperHeroes superman = new SuperHeroes("Superman",100,12,15);
        

    while(Principal.siguenVivos(goku.vida, superman.vida)){
    
        int round = 1;
        
        
        int golpeGoku = SuperHeroes.calcularGolpe();
        int golpeSuperman = SuperHeroes.calcularGolpe();
        
        System.out.println("::::::::::ROUND " + round + ":::::::::::" );
         
         if(golpeGoku > golpeSuperman){
        
         
             
          System.out.println("Goku golpea con un Power de: " + golpeGoku);
        
          superman.vida = superman.vida - golpeGoku;
          
             System.out.println("Superman queda en: " + superman.vida);
          
        }
         else{
         
         System.out.println("Superman golpea con un Power de: " + golpeSuperman);
        
          goku.vida = goku.vida - golpeSuperman;
          
             System.out.println("Goku queda en: " + goku.vida);
         
         
         }
        
         if(goku.vida>superman.vida){
         
             System.out.println("GOKU es el ganador!!!!!!");
         
         
         }
         else{
         
         System.out.println(" SUPERMAN es el ganador!!!!!!");
             
         }
         
        round++;
        
    }
    
        
    
      
    }//fin de main
    

    
}
