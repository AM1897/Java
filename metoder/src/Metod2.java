import java.util.Scanner;       //Vi importerar klassen Scanner från paketet java.util som gör att vi kan ta inmatning från användaren.

public class Metod2 {           //Vi definierar en klass som heter Metod2.
    public static void main(String[] args) {    //Vi definierar en main()-metod som är programmets ingångspunkt.
        Scanner scanner = new Scanner(System.in); //Vi skapar en ny instans av Scanner och använder System.in som argument för att ta inmatning från konsolen.

        System.out.println("Skriv in ditt namn");   //Vi skriver ut en fråga till användaren för att be dem att skriva sitt namn.
        String name = scanner.nextLine();           //sparar sedan användarens svar i en variabel som heter name.

        sayHello(name);     //Vi kallar på metoden sayHello() med användarens namn som argument.
    }

    public static void sayHello(String name) {
        System.out.println("Hej " + name + "!");
        //Vi definierar metoden sayHello() som tar en sträng som argument och skriver ut en hälsningsfras i konsolen som inkluderar användarens namn.
    }
}
