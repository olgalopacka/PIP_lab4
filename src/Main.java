import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witamy w kantorze !");
        System.out.println("Wybierz walutę: "+ "\n" + "1 - PLN" + "\n" +  "2 - JPY");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 1){
            System.out.println("Wprowadź kwotę: ");
            float amountInPLN = scanner.nextFloat();
            System.out.println(amountInPLN + " zł => " + amountInPLN*30.27 + " ¥");
        }
        else if(option == 2){
            System.out.println("Wprowadź kwotę: ");
            float amountInJPY = scanner.nextFloat();
            System.out.println(amountInJPY + " ¥ => " + amountInJPY/30.27 + " zł");
        }
        else {
            System.out.println("Wartość nieprawidłowa spróbuj jeszcze raz");
        }
    }
}