/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class Addition 
{
    public static void main (String[]args)
    {
     Scanner scan=new Scanner(System.in)
             int a,b,add;
             System.out.println("enter the first no");
             a=scan.nextInt();
             System.out.println("enter the second no");
             b=scan.nextInt();
             
        add=a+b;
        System.out.println("the addition is:"+add);
        
    }
    
}
