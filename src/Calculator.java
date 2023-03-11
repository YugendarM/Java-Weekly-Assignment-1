import java.util.Scanner;
public class Calculator {
    public static int calc(int num1,int num2,char choice)
    {
        int res=0;
        switch (choice){
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num1-num2;
                break;
            case '*':
                res = num1*num2;
                break;
            case '/':
                res = num1/num2;
                break;
            case '%':
                res = num1%num2;
                break;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers and operation you would like to perform:");
        int num1 = sc.nextInt();
        char choice = sc.next().charAt(0);
        int num2 = sc.nextInt();
        System.out.println("Result for the calculation is :"+calc(num1,num2,choice));
    }


}
