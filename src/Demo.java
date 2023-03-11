import java.util.Scanner;
public class Demo {
    public static void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res1 = a-b;
        int res2 = a*b;

        System.out.println("The difference is:"+ res1);
        System.out.println("The difference is:"+ res2);
    }

    public static void main(String[] args){
        calc();


    }

}
