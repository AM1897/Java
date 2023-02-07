import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hur många äpplen har ungarna?");

        int kalle = input.nextInt();
        int pelle = input.nextInt();

        int result = kalle + pelle;
        System.out.println(" Ungarna har " + result + " äpplen! ");
    }
}