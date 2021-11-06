import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        System.out.print("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int input = sc.nextInt();

        System.out.print("\n");

        switch (input % 2) {
            case 0 -> System.out.printf("Liczba %d jest parzysta\n", input);
            case 1 -> System.out.printf("Liczba %d jest nieparzysta\n", input);
        }



        switch (input % 7) {
            case 0 -> System.out.printf("Liczba %d jest podzielna przez 7\n", input);
            case 1, 2, 3, 4, 5, 6 -> System.out.printf("Liczba %d nie jest podzielna przez 7\n", input);
        }

        System.out.print("\n");
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        int[] var_table = {0,0,0,0,0,0};

        String text_check = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";

        for (char item : text_check.toCharArray()) {
            switch (item) {
                case 'o' -> ++var_table[0];
                case 'p' -> ++var_table[1];
                case 'x' -> ++var_table[2];
                case 'z' -> ++var_table[3];
                case 'q' -> ++var_table[4];
                default -> ++var_table[5];
            }
        }
        System.out.printf("Litera 'o' występuje %d razy\n", var_table[0]);
        System.out.printf("Litera 'p' występuje %d razy\n", var_table[1]);
        System.out.printf("Litera 'x' występuje %d razy\n", var_table[2]);
        System.out.printf("Litera 'z' występuje %d razy\n", var_table[3]);
        System.out.printf("Litera 'q' występuje %d razy\n", var_table[4]);
        System.out.printf("Pozostałe litery występuje %d razy\n", var_table[5]);

    }
}
