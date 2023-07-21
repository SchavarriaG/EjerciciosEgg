import Entidades.*;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        boolean valorValido;
        int base;
        int altura;
        int lado;
        int radio;

        do {
            System.out.println("Escribe el número de la figura que deseas calcular área y perímetro:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Círculo");
            System.out.println("5. Hexágono");
            System.out.println("6. Pentágono");
            System.out.println("7. Rombo");

            valorValido = true;


            switch (leer.nextLine()) {
                case "1" -> {
                    System.out.println("Escriba el lado del cuadrado:");
                    Cuadrado cuadrado = new Cuadrado(leer.nextInt());
                    System.out.println("El área del cuadrado es: " + cuadrado.area());
                    System.out.println("El perímetro del cuadrado es: " + cuadrado.perimetro());
                }
                case "2" -> {
                    System.out.println("Escriba la base del rectángulo:");
                    base = leer.nextInt();
                    System.out.println("Escriba la altura del rectángulo:");
                    altura = leer.nextInt();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("El área del rectángulo es: " + rectangulo.area());
                    System.out.println("El perímetro del rectángulo es: " + rectangulo.perimetro());
                }
                case "3" -> {
                    System.out.println("Escriba el lado del triángulo equilátero:");
                    base = leer.nextInt();
                    Triangulo triangulo = new Triangulo(base);
                    System.out.println("El área del triángulo es: " + triangulo.area());
                    System.out.println("El perímetro del triángulo es: " + triangulo.perimetro());
                }
                case "4" -> {
                    System.out.println("Escriba el radio del Círculo:");
                    Circulo circulo = new Circulo(leer.nextInt());
                    System.out.println("El área del Círculo es: " + circulo.area());
                    System.out.println("El perímetro del Círculo es: " + circulo.perimetro());
                }
                case "5" -> {
                    System.out.println("Escriba el lado del Hexágono:");
                    Hexagono hexagono = new Hexagono(leer.nextInt());
                    System.out.println("El área del Hexágono es: " + hexagono.area());
                    System.out.println("El perímetro del Hexágono es: " + hexagono.perimetro());
                }
                case "6" -> {
                    System.out.println("Escriba el lado del Pentágono:");
                    Pentagono pentagono = new Pentagono(leer.nextInt());
                    System.out.println("El área del Pentágono es: " + pentagono.area());
                    System.out.println("El perímetro del Pentágono es: " + pentagono.perimetro());
                }
                case "7" -> {
                    System.out.println("Escriba la diagonal 1 del Rombo:");
                    base = leer.nextInt();
                    System.out.println("Escriba la diagonal 2 del Rombo:");
                    altura = leer.nextInt();
                    Rombo rombo = new Rombo(base, altura);
                    System.out.println("El área del Rombo es: " + rombo.area());
                    System.out.println("El perímetro del Rombo es: " + rombo.perimetro());
                }
                default -> {
                    valorValido = false;
                    System.out.println("Opción inválida. Intenta de nuevo.");
                }
            }

        }while (!valorValido);
    }
}
