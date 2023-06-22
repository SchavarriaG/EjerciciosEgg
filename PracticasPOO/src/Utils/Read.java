package Utils;

import java.util.Scanner;

public class Read {
    static Scanner scanner = new Scanner(System.in);

    public static int integer(){
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static long integerLarge(){
        return scanner.nextLong();
    }

    public static String text(){
        return scanner.nextLine();
    }

    public static double decimal(){
        return scanner.nextDouble();
    }
}
