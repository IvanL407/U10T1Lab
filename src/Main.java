public class Main {

    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int num)
    {
        int total = 1;
        for (int i = num; i >= 1; i--)
        {
            total *= i;
        }
        return total;
    }
}
