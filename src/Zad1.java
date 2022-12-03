public class  Zad1 {
    public static void main(String[] args) {
        //zadanie 1

        boolean isRaining = false;
        boolean isSunny = true;

        if (isRaining && !isSunny) {
            System.out.println("plucha");
        } else if (isRaining && isSunny) {
            System.out.println("tecza");
        } else if (isSunny && !isRaining) {
            System.out.println("slonecznie");
        } else if (!isRaining && !isSunny) {
            System.out.println("pochmurno");
        }

    }
}