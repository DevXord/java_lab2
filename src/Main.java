import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        //numer indeksu 57072
        int index_last_number = 2;

        for (int i =100; i >= 0; i--)
        {
            if(i % index_last_number == 0)
                System.out.printf("Liczba %d jest podzielna przez %d\n",i,index_last_number);
        }
        System.out.println("\n");

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner sc = new Scanner(System.in);

        int[] int_table = new int[5];

        for(int i = 0; i < int_table.length; i++)
        {
            System.out.printf("Podaj %d liczbę: ",i+1);
            int input = sc.nextInt();
            int_table[i] = input;
        }

        System.out.println("\n");

        for (int number : int_table) {
            System.out.printf("Liczba %d powiększona o 11 wynosi %d\n",number,number + 11);
        }
    }
}
