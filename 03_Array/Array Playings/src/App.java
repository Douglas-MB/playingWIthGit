import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MyTools.clean();

        Scanner read;
        int option;
        String answer = "Y";

        Numbers obj = new Numbers();

        read = MyTools.scan();
        MyTools.bar();

        while (answer.equals("Y")) {
            System.out.println("Select a option to do some operation");
            option = read.nextInt();
            read.nextLine();
            switch (option) {
                case 1:
                    obj.readArraySize();
                    obj.operation1();
                    break;
                case 2:
                    obj.readArraySize();
                    obj.operation2();
                    break;
            }
            System.out.print("Do u wanna to do it again?\t");
            answer = read.nextLine();

            if (answer.equals("Y")) {
                continue;
            } else {
                break;
            }

        }
    }
}
