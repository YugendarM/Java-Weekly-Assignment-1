import java.util.Scanner;
public class AreaofRhombus {
    public static int areaCalc(int d1,int d2)
    {
        int area = (d1*d2)/2;
        return area;
    }
    public static void main(String[] args){
        System.out.println("Enter the diagonals of the rhombus:");
        Scanner sc = new Scanner (System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.println("The area of the given rhombus is: "+areaCalc(d1,d2)+"sq.meter");
    }

}
