import java.util.Scanner;
public class energy3{
    Scanner sc=new Scanner(System.in);
    void calculatetotalenergy(double morning , double evening){
        System.out.println("enter the morning energy generated");
        morning=sc.nextDouble();
        System.out.println("enter the evening energy generated");
        evening=sc.nextDouble();
        double total= morning+evening;
        System.out.println("The total energy generated"+total);
    }
    public static void main(String[]args){
        
        energy3 e=new energy3();
        e.calculatetotalenergy(300 , 100);

    }
}