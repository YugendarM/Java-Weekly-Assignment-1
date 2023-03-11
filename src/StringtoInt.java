import java.util.Scanner;
public class StringtoInt {
    public static int convert(String input)
    {
        int value = Integer.parseInt(input);
        return value;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to conver into Integer:");
        String input = sc.nextLine();
        System.out.println("Integer for the entered String is:"+convert(input));



    }


}
