import java.util.Scanner;

public class Compare {
    public static void compare1(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        int a= sca.nextInt();
        int b= sca.nextInt();
        int c= sca.nextInt();
        if(a==b && b==c)
        {
            System.out.println("All the three numbers are equal");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.println("Two of the three numbers are equal");
            if(a==b)
            {
                System.out.println(a+" and "+b+" are equal");
            }
            else if(b==c)
            {
                System.out.println(b+" and "+c+" are equal");
            }
            else {
                System.out.println(a+" and "+c+" are equal");
            }
        }
        else {
            System.out.println("Any of the three numbers are not equal");
        }
    }

    public static void main(String[] args){

        compare1();


    }
}
