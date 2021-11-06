public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        System.out.println("\n\n");

        int i = 1000;
        // numer indeksu: 57072
        int index_last_numbers = 72;

        do{
            if(i % index_last_numbers == 0)
                System.out.printf("Liczba %d podzielna przez %d\n",i,index_last_numbers);
            i--;
        }while(i != 0);

        System.out.println("\n\nint table");


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int[] int_table = new int[5];
        int_table[0] = 1;
        int_table[1] = 2;
        int_table[2] = 3;
        int_table[3] = 4;
        int_table[4] = 5;

        while( i != int_table.length )
        {
            System.out.printf("Numer indeksu int_table intów %d wartość %d\n",i,int_table[i]);
            i++;
        }
        System.out.println("\n\nDouble table");

        double[] double_table = new double[5];
        double_table[0] = 1.1;
        double_table[1] = 2.2;
        double_table[2] = 3.3;
        double_table[3] = 4.4;
        double_table[4] = 5.5;
        i = 0;
        while( i != double_table.length )
        {
            System.out.printf("Numer indeksu double_table %d wartość %f\n",i,double_table[i]);
            i++;
        }


        System.out.println("\n\nString table");

        String[] string_table = new String[5];
        string_table[0] = "table";
        string_table[1] = "from";
        string_table[2] = "message";
        string_table[3] = "is";
        string_table[4] = "This";
        i = string_table.length-1;
        while( i != -1 )
        {
            System.out.printf("Numer indeksu string_table %d wartość %s\n",i,string_table[i]);
            i--;
        }


        System.out.println("\n\n");

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        /*
        while(true)
        {
            System.out.println("Pętla nieskończona\n");

        }
        */

        /*
          while(false)
          {
              System.out.println("Failed\n");

          }

        */

    }
}
