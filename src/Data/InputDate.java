package Data;

import java.util.Scanner;

public class InputDate {


    public static String[] inputDate() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] data = str.split(" ");
       /* for (int i = 0; i <data.length; i++) {
            System.out.println(data[i]);

        }*/
        return data;
    }
}