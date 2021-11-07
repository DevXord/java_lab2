import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        public static ArrayList<String> string_list = new ArrayList<>();
        public static void showAllListElements(){
            for (String item : string_list) {
                System.out.printf("%s\n",item);

            }
        }
    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1  */
        //a
        string_list.add("Kot");
        string_list.add("Pies");
        string_list.add("Koń");
        string_list.add("Owca");
        string_list.add("Jeleń");
        //b
        System.out.print("Wypisywanie\n");
        showAllListElements();
        //c
        string_list.remove(string_list.size()-1);
        string_list.remove(string_list.size()-1);
        string_list.add("Mrówka");
        string_list.add("Sarna");
        string_list.add("Wielbłąd");
        System.out.print("\nWypisywanie nowej tablicy\n");
        showAllListElements();
        System.out.print("Wielkość listy: "+string_list.size());
        System.out.print("\n");
        //d
        System.out.print("\nOdwrócona tablica\n");
        Collections.reverse(string_list);
        showAllListElements();



         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        System.out.println();
        Set<Integer> sets = new TreeSet<>();
        ArrayList<Integer> sortSet = new ArrayList<>();


        for (int i=0; i<=10;i++) {
            System.out.printf("Wprowadź %d liczbę: ",i+1);
            int input = sc.nextInt();
            sets.add(input);
            sortSet.add(input);

        }

        Collections.sort(sortSet);

        Set<Integer> resultSet = new TreeSet<>(sortSet);
        System.out.println();
        System.out.println(resultSet+"");
        System.out.print("\n");

        for (var item : resultSet){
            System.out.print(item+"\n");
        }
    }

}
