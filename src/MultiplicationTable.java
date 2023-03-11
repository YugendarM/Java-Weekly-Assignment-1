import java.util.Scanner;
public class MultiplicationTable {
    public static void table(int num)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + " * "+ i +" = "+ num*i );
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to print the multiplication table:");
        int num = sc.nextInt();
        System.out.println("The multiplication table is:");
        table(num);

    }
}
