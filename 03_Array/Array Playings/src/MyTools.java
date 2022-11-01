import java.io.IOException;

public class MyTools {
    public MyTools() {
    }

    public static void multiBar() {
        for (int aux = 0; aux < 3; aux++) {
            bar();
        }
    }

    public static void bar() {
        char auxArray[] = { '-' };
        for (int aux = 0; aux < 51; aux++) {
            System.out.print(auxArray[0]);
        }
        System.out.println();
    }

    public static String space() {
        String spc = " ";
        return spc;
    }

    public static void clean() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
