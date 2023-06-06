package Utils;

public class Escribir {

    public static void conSalto(Object str){
        System.out.println(str.toString());
    }

    public static void conSalto(String str){
        System.out.println(str);
    }

    public static void conSalto(int str){
        System.out.println(str);
    }

    public static void sinSalto(Object str){
        System.out.print(str.toString());
    }
}
