import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vad heter du?");

        String name = input.next();

        System.out.println(" Hej " + name + "!");
    }
}