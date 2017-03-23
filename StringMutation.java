/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */import java.lang.String
public class StringMutation {
    public static void main (Sting[] args)
            
            
    {
        String phrase="change is invitable";
        
        String mut1,mut2,mut3,mut4;
        
        System.out.println("Original string"+phrase);
        System.out.println("String length is:"+phrase.length());
        
         mut1=phrase.concat(",except from vending machines");
         mut2=mut1.toUpperCase();
         mut3=mut2.replace('E','X');
         mut4=mut3.substring(5,30);
         
         System.out.println ("Mutation #1: " + mut1);
         System.out.println ("Mutation #2: " + mut2);

         System.out.println ("Mutation #3: " + mut3);
         System.out.println ("Mutation #4: " + mut4);
         System.out.println ("Mutated length: " + mut4.length());
         
        
    }
    
}
