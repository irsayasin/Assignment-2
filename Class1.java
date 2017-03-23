/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
  public class Class1{
      public static void main(String[] args)
  
  {
    Scanner scan=new Scanner(System.in)
    int x,y,z;
      System.out.println("Enter first number:=");
    
    x=scan.nextInt();
   
    System.out.println("Enter second number:=");
   
    y=scan.nextInt();
    z=x*y;
     System.out.print("The multiple of two numbers is:="+z)
    
    
}
  }