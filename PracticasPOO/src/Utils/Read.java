package Utils;

import java.util.Scanner;

public class Read {
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static int integer(){
        int integer = scanner.nextInt();
        scanner.nextLine();
        return integer;
    }

    public static long integerLarge(){
        long largo = scanner.nextLong();
        scanner.nextLine();
        return largo;
    }

    public static String text(){
        return scanner.nextLine();
    }

    public static double decimal(){
        return scanner.nextDouble();
    }
}
