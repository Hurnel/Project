import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak długi ma być ciąg znaków?");
        main.Los(scanner.nextInt());
    }

    public static void Los(int a)
    {
        Random rand = new Random();
        char b;
        for (int i = 0; i<a; i++)
        {
            b = (char)(rand.nextInt(26) + 'a');
            System.out.print(b);
        }
    }
}
