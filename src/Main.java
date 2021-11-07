
import java.util.Scanner;

public class Main {

        public static Scanner sc = new Scanner(System.in);
        /* ćwiczenie 5 Metody */

            /* zad.1
            a) stworzyć tablicę typu int[20],
            b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
            c) napisać metodę, która wypisze otrzymane wartości,
            d) wstawić wywołanie metody do metody main
            */

        public static int[] int_table = new int[20];


        public static void tableMakeUp(){
            for (int i = int_table.length-1; i >= 0; i--)
                int_table[i] = 40 - i;


            for (int i = 0; i <= int_table.length -1; i++)
                System.out.print(int_table[i] +"\n");

        }


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
          public static String[] str_table = new String[6];

          public static void getKeyboardValue(){
            for (int i = 0; i <= str_table.length -1; i++) {

                System.out.printf("Wpisz %d słowo: ",i+1);
                str_table[i] = sc.nextLine();

            }
          }

        public static void getAllTableElements(){
            for (int i = str_table.length -1; i >= 0; i--)
                System.out.print(str_table[i] +"\n");

        }

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        public static void writeName(String name){
            System.out.printf("Imie: %s",name);

        }
        public static void writeName(String name, String surname){
            System.out.printf("Imie: %s, Nazwisko: %s",name,surname);

        }
        public static void writeName(String name, String surname,int age){
            System.out.printf("Imie: %s, Nazwisko: %s, Wiek: %d",name,surname,age );

        }
        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        public static int add(int number1,int number2){
            return number1 + number2;

        }


        public static int add(int number1,int number2,int number3){
            return number1 + number2 + number3;

        }



    public static void main(String[] args) {

        /* zad.1 */
        tableMakeUp();

        System.out.print("\n");
        /* zad.2 */
        
        System.out.print("\nWczytywanie...\n");
        getKeyboardValue();
        
        System.out.print("\nWypisywanie\n");
        getAllTableElements();
        
        
        System.out.print("\n");
        
        /* zad.3 */

        writeName("Patryk", "Kaszuba",24);

        /* zad.4 */
        System.out.print("\n\n");

         int result = add(1,2);
         System.out.printf("Wynik dodawania: %d\n",result);

        result = add(7, 8, 9);
        System.out.printf("Wynik drugiego dodawania: %d\n",result);

        System.out.printf("Suma wyników: %d\n", (add(8, 9) + add(2, 3, 4)));
    }

}
