import javax.swing.*;


public class ZadDodatkowe {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Witamy w kantorze !");
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Wybierz walutę: \n1 - PLN \n2 - JPY"));

        if (option == 1){
            float amountInPLN = Float.parseFloat(JOptionPane.showInputDialog(null, "Wprowadź kwotę: "));
            JOptionPane.showMessageDialog(null, amountInPLN + " zł => " + amountInPLN*30.27 + " ¥");
        }
        else if(option == 2){
            float amountInJPY = Float.parseFloat(JOptionPane.showInputDialog(null, "Wprowadź kwotę: "));
            JOptionPane.showMessageDialog(null, amountInJPY + " ¥ => " + amountInJPY/30.27 + " zł");
        }
        else {
            JOptionPane.showMessageDialog(null, "Wartość nieprawidłowa spróbuj jeszcze raz");
        }
    }
}