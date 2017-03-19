import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        final int poniedzialek = 1;
        final int wtorek = 2;
        final int sroda = 3;
        final int czwartek = 4;
        final int piatek = 5;
        final int sobota = 6;
        final int niedziela = 7;
        //int day = 8;
        String dayName = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nr dnia tygodnia - przedział 1-7");
        int day = scanner.nextInt();
        while (day > 7 || day <= 0) {
            System.out.println("spróbuj raz jezcze");
            day = scanner.nextInt();
        }
        switch (day) {
            case poniedzialek:
                dayName = "poniedzialek";
                break;
            case wtorek:
                dayName = "wtorek";
                break;
            case sroda:
                dayName = "sroda";
                break;
            case czwartek:
                dayName = "czwartek";
                break;
            case piatek:
                dayName = "piatek";
                break;
            case sobota:
                dayName = "sobota";
                break;
            case niedziela:
                dayName = "niedziela";
                break;
        }
        System.out.println("podany numer dnia tygodnia " + day);
        System.out.println("podany dzień to: " + dayName);
        if (day == 6 || day == 7) {
            System.out.println(dayName + ": to dzień wolny");
        } else if (day > 0 && day <= 5) {
            System.out.println(dayName + ": to dzień wolny");
        } else {
            System.out.println("wprowadz prawidłowy nr dnia przedział 1-7");
        }
    }
}
