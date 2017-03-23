/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
public class Cube {
   
    public static void main(String[] args) 
    {
        int n1, n2;
        double SumOfCube;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        n1 = scan.nextInt();
        System.out.println("Enter second Number:");
        n2 = scan.nextInt();
        SumOfCube = Math.pow(n1, 3) + Math.pow(n2, 3);
        System.out.print("sum of cubes is::     " + SumOfCube);
        }    
}