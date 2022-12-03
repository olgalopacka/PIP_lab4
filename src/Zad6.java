import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        if (a >= b) {
            float buffer = a;
            a = b;
            b = buffer;
        }

        System.out.println(" Wybrany przedział: [" + a + ", " + b + "" + "]");


        Random random = new Random();
        float d1 = a + random.nextFloat() * (b - a);
        float d2 = a + random.nextFloat() * (b - a);
        float d3 = a + random.nextFloat() * (b - a);

        System.out.println("Wartości generowane losowo: " + "\n" + d1 + "\n" + d2 +  "\n" + d3);

        if (d1 < d2 && d2 < d3) {
            System.out.println("Gdzie: " + d1 + " < " + d2 + " < " + d3);
        }
        if (d1 < d2 && d2 > d3) {
            System.out.println("Gdzie: " + d1 + " < " + d3 + " < " + d2);
        }
        if (d1 > d2 && d2 > d3) {
            System.out.println("Gdzie: " + d3 + " < " + d2 + " < " + d1);
        }
        if (d1 > d2 && d2 < d3) {
            System.out.println("Gdzie: " + d2 + " < " + d3 + " < " + d1);
        }
    }
}

