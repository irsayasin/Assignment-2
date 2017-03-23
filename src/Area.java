import java.util.Scanner;
public class Area {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
    //area=pi*r*r
    double r,pi=3.14;
    double area;
    
    System.out.println("enter the vlue of radius");
    r=sc.nextDouble();
    area=pi*r*r;
    System.out.println("area of circle is= \t"+area);
    
    }
}
