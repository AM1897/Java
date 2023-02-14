import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ange månad (som nr)");
        int month = input.nextInt();

        System.out.println("Ange dag (som nr)");
        int day = input.nextInt();

        int result = month * 100 + +day;       //Månad blir gånger 100 + en dag och plussar ihop allt i result.

        if (result >= 120 && result <= 218) {   //Om result är större än 120 eller lika med 218 kommer koden att skriva ut ditt astrologiska tecken är Vattumannen.
            System.out.println("Ditt astrologiska tecken är Vattumannen.");
        } else if (result >= 219 && result <= 320) {
            System.out.println("Ditt astrologiska tecken är Fiskarna.");
        } else if (result >= 321 && result <= 420) {
            System.out.println("Ditt astrologiska tecken är Väduren.");
        } else if (result >= 421 && result <= 521) {
            System.out.println("Ditt astrologiska tecken är Oxen.");
        } else if (result >= 522 && result <= 621) {
            System.out.println("Ditt astrologiska tecken är Tvillingarna.");
        } else if (result >= 622 && result <= 722) {
            System.out.println("Ditt astrologiska tecken är Kräften.");
        } else if (result >= 723 && result <= 822) {
            System.out.println("Ditt astrologiska tecken är Lejonet.");
        } else if (result >= 823 && result <= 922) {
            System.out.println("Ditt astrologiska tecken är Jungfru.");
        } else if (result >= 923 && result <= 1022) {
            System.out.println("Ditt astrologiska tecken är Vågen.");
        } else if (result >= 1023 && result <= 1121) {
            System.out.println("Ditt astrologiska tecken är Skorpionen.");
        } else if (result >= 1122 && result <= 1221) {
            System.out.println("Ditt astrologiska tecken är Skytten.");
        } else if (result >= 1222 && result <= 1231) {
            System.out.println("Ditt astrologiska tecken är Stenbocken.");
        } else if (result >= 101 && result <= 120) {
            System.out.println("Ditt astrologiska tecken är Stenbocken.");
        } else {
            System.out.println("Ditt astrologiska tecken är Stenbocken.");
        }

    }
}
