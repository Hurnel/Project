import java.util.Scanner;

public class Pilot
{
    TV tel = new TV();
    Scanner scanner = new Scanner(System.in);
    public void start()
    {
        Menu();
        if(scanner.next().equals("on")) {
            tel.setState(true);
            while (tel.isState())
            operation(scanner.next());
        }
        System.out.println("Tv jest wyłączony");
    }

    private void Menu()
    {
        System.out.println(
                "Aby wlaczyc TV wpisz on, aby go wylaczyc: off\n" +
                        "Aby wybrac kanal wpisz cyfry od 1 do 9\n" +
                        "Aby zmienic kanal wpisz + lub -\n" +
                        "Aby zwiekszyc glosnosc wpisz vol+\n" +
                        "Aby zmniejszyc glosnosc wpisz vol-\n" +
                        "Wylaczenie TV konczy prace programu\n" +
                        "Pamietaj, aby najpierw go wlaczyc."
        );
    }

    private void operation(String o)
    {
        if(o.equals("on"))
            tel.setState(true);
        else if(o.equals("off"))
            tel.setState(false);
        else if(o.equals("1")||o.equals("2")||o.equals("3")||o.equals("4")||o.equals("5")||
                o.equals("6")||o.equals("7")||o.equals("8")||o.equals("9"))
            tel.setChannel(o);
        else if(o.equals("+"))
            tel.changeChannel(true);
        else if(o.equals("-"))
            tel.changeChannel(false);
        else if(o.equals("vol+"))
            tel.changeVolume(true);
        else if(o.equals("vol-"))
            tel.changeVolume(false);
        else
            System.out.println("Nie rozpoznaje polecenia, wpisz nastepne");
    }
}