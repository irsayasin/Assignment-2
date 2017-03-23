/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class GasMileage {
    public static void main (String[] args)
    {
        int miles;
        double gallon,mpg;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter the number of miles:=");
        miles=scan.nextInt();
        
        System.out.print("Enter the number of gallons:=");
        gallon=scan.nextDouble();
        
        mpg=miles/gallon;
        
        System.out.print("miles per gallon is:="+mpg);
        
        
        
    }
    
}
