import java.util.Scanner;

public class Numbers {
    Scanner read;
    int arraySize;
    int num[] = new int[arraySize];
    /*
     * public void operation0() throws InterruptedException {
     * // it acess the ARRAY POSITION
     * // int num[] = new int[5];
     * for (int aux = 4; aux != 0; aux--) {
     * num[aux] = 5;
     * System.out.println(aux + "\t" + num[aux]);
     * Thread.sleep(1000);
     * }
     * MyTools.bar();
     * for (int aux = 0; aux != 5; aux++) {
     * System.out.println(aux + "\t" + num[aux]);
     * Thread.sleep(1000);
     * }
     * MyTools.bar();
     * for (int aux = 0; aux < num.length; aux++) {
     * System.out.println(aux + "\t" + num[aux]);
     * Thread.sleep(1000);
     * }
     * }
     */

    public void readArraySize() {
        // arraySize = read.nextInt();
        // MyTools.multiBar();
        Scanner read = new Scanner(System.in);
        System.out.print("Enter with array size:\t");
        if (read.hasNextInt() == true) {
            arraySize = read.nextInt();
        }
        MyTools.multiBar();
    }

    public void operation1() {
        int num[] = new int[arraySize];
        /*int auxArray = read.nextInt();
            for (int aux = 0; aux < num.length; aux++) {
                num[aux] = auxArray;
            }
            MyTools.bar();
            for (int aux = 0; aux < num.length; aux++) {
                System.out.print(aux + "\t" + num[aux] + "\n");
            }*/
    }

    public void operation2() {
        int num[] = new int[arraySize];

        for (int aux1 = 0;aux1<num.length;aux1++) {
            num[aux1] = arraySize-aux1;

            System.out.print(aux1+"\t"+num[aux1] + "\n");
        }

    }
    
    // --------------------END-------------------
}
