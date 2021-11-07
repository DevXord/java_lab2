public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        System.out.print("\n\nBreak");
        for(int i=0; i<= 10; i++)
        {
            if(i==7)
            {

                break;}
            System.out.printf(" %d",i);
        }

        System.out.print("\n\nContinue");
        for(int i=0; i<= 10; i++)
        {
            if(i==5)
            {

                continue;
            }
            System.out.printf(" %d",i);
        }

        System.out.print("\n\nReturn");
        for(int i=0; i <= 10; i++)
        {
            if(i==5)
            {

                return;
            }
            System.out.printf(" %d",i);
        }
    }
}
