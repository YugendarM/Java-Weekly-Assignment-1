import java.util.Scanner;

public class Area {
    public static void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the triangle:");
        double len = sc.nextDouble();
        double bre = sc.nextDouble();
        double area = len*bre;
        System.out.println("The area of the rectangle is "+(int)area);
    }
    public static void main(String[] args){

        area();

    }
}
