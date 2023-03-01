import java.util.Scanner;

public class Metod3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad är ditt födelseår?");
        int birthYear = scanner.nextInt();

        boolean isUnder18 = checkAge(birthYear);

        if (isUnder18) {
            System.out.println("Du är under 18 år. ");
            //Vi använder en if-sats för att skriva ut ett
            // meddelande beroende på värdet av isUnder18.
            // Om det är true att användaren är under 18 år
            // skriver vi ut ett meddelande som säger "Du är under 18 år."
        } else {
            System.out.println("Du är över 18 år.");
            // Om den inte är true så skriver vi ut ett meddelande som säger "Du är över 18 år."
        }
    }

    public static boolean checkAge(int birthYear) {
        //Vi definierar metoden checkAge() som tar in födelseåret som argument.
        int currentYear = java.time.Year.now().getValue();
        //Metoden räknar ut användarens ålder genom att minus födelseåret från nuvarande år,
        // som vi hämtar med hjälp av java.time.Year.now().getValue().
        int age = currentYear - birthYear;
        return age < 18;    //Vi returnerar sedan en boolean som indikerar om användaren är under 18 eller inte.
    }
}
