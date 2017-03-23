/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class Class3 {
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in)
                 
                double rad,circumference;
                double pi=3.14;
                System.out.print("Enter radius:=");
                rad=scan.nextFloat();
                circumference=2*pi*rad;
                System.out.print("The circumfernce is:="+circumference);
                
                
    }
    
}
