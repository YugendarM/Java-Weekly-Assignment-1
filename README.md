# JAVA-WEEKLY-ASSIGNMENT-1
## 1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers
```java
import java.util.Scanner;
public class ArithmaticOperations
{
    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static int sub(int a,int b){
        int dif = a - b;
        return dif;
    }
    public static int mul(int a,int b){
        int pro = a * b;
        return pro;
    }
    public static int div(int a,int b){
        int fra = a / b;
        return fra;
    }
    public static int mod(int a,int b){
        int rem = a % b;
        return rem;
    }
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the value for a and b:");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The Addition of "+ " a " + " b " + " is :"+ add(a,b));
        System.out.println("The Subtraction of "+ " a " + " b " + " is :"+ sub(a,b));
        System.out.println("The Multiplication of "+ " a " + " b " + " is :"+ mul(a,b));
        System.out.println("The Division of "+ " a " + " b " + " is :"+ div(a,b));
        System.out.println("The Remainder of "+ " a " + " b " + " is :"+ mod(a,b));
    }
}
```
## OUTPUT
![arithOperation](https://user-images.githubusercontent.com/119681539/224487772-c49701f0-802b-4885-ba2f-8f11a4ca3380.png)


