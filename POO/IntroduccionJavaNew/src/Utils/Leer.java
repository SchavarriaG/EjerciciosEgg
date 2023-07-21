package Utils;

import java.util.Scanner;

public class Leer {
    static Scanner scanner = new Scanner(System.in);

    public static int entero(){
        return scanner.nextInt();
    }

    public static String caracter(){
        return scanner.nextLine();
    }

    public static double decimal(){
        return scanner.nextDouble();
    }
}
