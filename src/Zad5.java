import java.util.Scanner;

public class Zad5 {
    static int add(int x, int y){
        return x + y;
    }

    static int subtract(int x, int y){
        return x - y;
    }

    static int multiply(int x, int y){
        return x * y;
    }

    static int divide(int x, int y){
        return x / y;
    }

    static int absoluteValue(int x){

        if (x >= 0) {
            return x;
        }
        else{
            return multiply(x, -1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbę całkowitą a");
        String firstString = scanner.nextLine();

        System.out.println("Wpisz liczbę całkowitą b");
        String secondString = scanner.nextLine();

        Integer firstNumber = Integer.parseInt(firstString);
        int secondNumber = Integer.parseInt(secondString);

        int result;

        System.out.println("Wprowadzone liczby to: a = " + firstNumber + " b = " + secondNumber);

        System.out.println("Wprowadź operację jaką chcesz wykonać na liczbach : ADD - dodawanie, SUB - odejmowanie, DIV - dzielenie, MUL - mnożenie ");
        String operation = scanner.nextLine();

        switch (operation){
            case "ADD":
                result = add(firstNumber, secondNumber);
                System.out.println("Wynik = "+absoluteValue(result));
                break;
            case "SUB":
                result = subtract(firstNumber, secondNumber);
                System.out.println("Wynik = "+absoluteValue(result));
                break;
            case "DIV":
                result = divide(firstNumber, secondNumber);
                System.out.println("Wynik = "+absoluteValue(result));
                break;
            case "MUL":
                result = multiply(firstNumber, secondNumber);
                System.out.println("Wynik = "+absoluteValue(result));
                break;
            default:
                System.out.println("Brak takiej operacji");
                break;
        }

    }
}