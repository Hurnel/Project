import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        int a,b=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do obliczenia silni: ");
        a = scanner.nextInt();
        for (int i = 1; i<a+1; i++)
        {
            b=b*i;
        }
        System.out.print("Silnia z " + a + " = " + b);
    }
}