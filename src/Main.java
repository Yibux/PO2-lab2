import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj tekst: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int a = 0,b = 0;
        try{
            System.out.print("Podaj pierwszy indeks: ");
            a = scanner.nextInt();
            System.out.print("Podaj drugi indeks: ");
            b = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Nie podano liczby!");
        }

        if(b>a && text.length() - a < b) {
            b = text.length() - 1;
        }

        try {
            System.out.print("Nowy tekst: " + text.substring(a,b+1));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Index 1 jest wiekszy od 2!");
        }

    }
}