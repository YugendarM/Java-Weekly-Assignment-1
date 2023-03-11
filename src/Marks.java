public class Marks {
    public static void main(String[] args)
    {
        float sub1 = 78;
        float sub2 = 45;
        float sub3 = 62;

        float total = sub1+sub2+sub3;
        float perc = (total/300)*100;
        System.out.println("Total marks is:"+(int)total);
        System.out.println("Percentage is:"+perc);
    }

}
