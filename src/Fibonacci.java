public class Fibonacci
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print(fibonacci(i + 1) + " ");
        }
    }

    private static int fibonacci(int x)
    {
        if(x == 1 || x == 2)
        {
            return 1;
        }

        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}

