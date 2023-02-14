import java.lang.reflect.Array;     // vart kom dessa ifrån
import java.util.Arrays;            // vart kom dessa ifrån
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] heltal = {5, 2, 7, 1, 9, 3, 8, 4, 6, 10}; //här har vi 10 heltal

        int[] femforsta = Arrays.copyOfRange(heltal, 0, 5); // här väljer vi de 5 första heltalen som finns där uppe
        printArray(femforsta);          //här skall vi skriva ut


    }

    private static void printArray(int[] array) {        //Vad händer här? kallar den in en Array som finns ovanför kanske?
        System.out.println("Siffror: ");
        for (int i = 0; i < array.length; i++){         // Längden på en array. Vi har loppen som ser till att vi ska ha de 5 först heltalen.
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}