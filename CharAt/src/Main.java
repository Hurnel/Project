import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź text");
        String str = scanner.nextLine();
        System.out.println("Wprowadź cyfre z przedziału 1 - " + str.length());
        int a = scanner.nextInt();
        a =+ a;
        System.out.println("Na miejscu " + a + " znajduje się litera " + str.charAt(a-1));
    }
}