import Ejercicios.Ejercicio1;
import Ejercicios.Prueba;
import Entity.Curso;
import Entity.Movil;

public class Main {
    public static void main(String[] args) {

        //Prueba
        //Prueba.inicializar();

        //Ejercicio 1
        //Ejercicio1.inicializar();

        //Ejercicio 2
        /*Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        Write.withLineBreak("El área del círculo es: "  + c1.calcularArea());
        Write.withLineBreak("El perímetro del círculo es: "  + c1.calcularPerimetro());

        //Ejercicio 3
        Operacion operacion1 = Operacion.crerOperacion(); // Math.sqrt()
        Write.withLineBreak("La suma de los números es "  + operacion1.sumar());
        Write.withLineBreak("La resta de los números es "  + operacion1.restar());
        Write.withLineBreak("La multiplicación de los números es "  + operacion1.multiplicar());
        Write.withLineBreak("La división de los números es "  + operacion1.dividir());
        */

        //Ejercicio 4
        /*Rectangulo rectangulo1 = Rectangulo.crearRectangulo();
        Write.withLineBreak("La superficie del rectángulo es: " + rectangulo1.calcularSuperficie());
        Write.withLineBreak("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());
        rectangulo1.dibujarRectangulo();*/

        //Ejercicio 5
        /*Cuenta cuenta1 = Cuenta.crearCuenta();
        cuenta1.consultarDatos();
        cuenta1.consultarSaldo();
        Write.withLineBreak("Enviaste un ingreso de 1000$.");
        cuenta1.ingresar(1000);
        cuenta1.consultarSaldo();
        Write.withLineBreak("Enviaste un retiro de 500$.");
        cuenta1.retirar(500);
        cuenta1.consultarSaldo();
        Write.withLineBreak("Enviaste un retiro rápido de 2000$.");
        cuenta1.extraccionRapida(2000);*/

        //Ejercicio 6
        // Probar con los valores 200, 300  respectivamente para ver todas las funcionalidades
        /*Cafetera cafetera1 = new Cafetera(1000,50);
        cafetera1.vaciarCafetera();
        Write.withLineBreak("Se llenará la cafetera.");
        cafetera1.llenarCafetera();
        Write.withLineBreak("Ingresa la cantidad de café que desea servir: ");
        cafetera1.servirTaza(Read.integer());
        Write.withLineBreak("Ingresa la cantidad de café que desea agregar: ");
        cafetera1.agregarCafe(Read.integer());*/

        //Ejercicio7
        /*Write.withLineBreak("Ingresa la cantidad de personas que desea registrar: ");
        int cantidadPersonas = Read.integer();
        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i< personas.length;i++){
            personas[i] = PersonaService.crearPersona();
            Write.withLineBreak("Se registró la persona: "+personas[i]);
        }
        int contadorMayores = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrePeso = 0;
        int contadorPesoBajo = 0;
        for (Persona persona : personas){
            Write.withLineBreak("Para "+persona.getNombre()+" :");
            int imc = PersonaService.calcularIMC(persona);
            if (imc == -1){
                Write.withLineBreak("Estás por debajo de tu peso ideal.");
                contadorPesoBajo++;
            }else if(imc == 0){
                Write.withLineBreak("Estás en tu peso ideal.");
                contadorPesoIdeal++;
            }else{
                Write.withLineBreak("Tienes sobrepeso.");
                contadorSobrePeso++;
            }

            if(PersonaService.esMayorDeEdad(persona)){
                Write.withLineBreak("Es mayor de edad.");
                contadorMayores ++;
            }else {
                Write.withLineBreak("Es menor de edad.");
            }
        }

        System.out.println("El porcentaje de personas mayores de edad es " + (double) contadorMayores / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas menores de edad es " + (double) (cantidadPersonas - contadorMayores) / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas con el peso menor al ideal es " + (double) contadorPesoBajo / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas con el peso ideal es " + (double) contadorPesoIdeal / cantidadPersonas * 100 + "%" );
        System.out.println("El porcentaje de personas con sobrepeso es " + (double) contadorSobrePeso / cantidadPersonas * 100 + "%" );*/

        //Ejercicio 8
        /*Cadena cadena = new Cadena();
        Write.withLineBreak("Ingrese la frase que desee: ");
        cadena.setFrase(Read.text());

        Write.withLineBreak("Contabilicemos las vocales: tiene " + cadena.mostrarVocales() + " vocales.");

        Write.withLineBreak("Frase invertida: " + cadena.invertirFrase());

        Write.withLineBreak("Ingresa el caracter que quieres contabilizar en la frase: ");
        String caracter = Read.text();
        Write.withLineBreak("El caracter \"" + caracter+ "\" está "+ cadena.vecesRepetido(caracter) + " veces.");

        Write.withLineBreak("Ingresa la frase que deseas comparar en tamaño con la frase principal:");
        String rta = (cadena.compararLongitud(Read.text())) ? "Sí": "No";
        Write.withLineBreak("La cadena " + rta + " tiene la misma cantidad de caracteres." );

        Write.withLineBreak("Ingresa la frase que desees unir con la frase principal:");
        Write.withLineBreak("La frase resultante es: " + cadena.unirFrases(Read.text()) );

        Write.withLineBreak("Ingresa un caracter para reemplazar en la frase principal: ");
        Write.withLineBreak("La frase resultante es: " + cadena.reemplazarLetra(Read.text()));

        Write.withLineBreak("Ingresa el caracter que deseas buscar en la frase principal: ");
        caracter = Read.text();
        rta = (cadena.contiene(caracter)) ? "Sí": "No";
        Write.withLineBreak("La cadena " + rta + " contiene el caracter " + caracter );*/

        //Ejercicio 9
        //Matematica matematica = new Matematica(Math.random(),Math.random());

        /*double a = Math.random();
        double b = Math.random();
        Matematica.setNumA(a);
        Matematica.setNumB(b);
        System.out.println("El valor mayor es: " + Matematica.devolverMayor());
        System.out.println("El valor mayor elevado al valor menor: "
                + Matematica.redondear(Matematica.devolverMayor(),2)+ "^"
                + Matematica.redondear(Matematica.devolverMenor(),2) +" = "
                + Matematica.calcularPotencia());
        System.out.println("La raíz del valor menor es: " + Matematica.calculaRaiz());*/

        //Ejercicio 10
        //IMPORTANTE: NO USÉ LA CLASE ARRAY PORQUE NO LO VI :(
        /*double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        ArregloService.inicializar(arregloA);
        System.out.println("Arreglo A inicializado:");
        ArregloService.imprimirArreglo(arregloA);
        arregloA = ArregloService.ordenarArreglo(arregloA);
        System.out.println("Arreglo A ordenado:");
        ArregloService.imprimirArreglo(arregloA);
        ArregloService.llenarArreglo(arregloB, arregloA);
        System.out.println("Arreglo B inicializado:");
        ArregloService.imprimirArreglo(arregloB);
        System.out.println("Arreglo A ordenado luego de llenar B:");
        ArregloService.imprimirArreglo(arregloA);*/

        //Ejercicio 11
        // Descomentar si desea preguntarle al usuario
        // PracticaOnce.inicializarConUsuario();
        //PracticaOnce.inicializarSinUsuario(2022,12,12);

        //Ejercicio 12
        /*PersonaV2 persona = PersonaV2.crearPersona();
        Write.withLineBreak("La edad de "+ persona.getNombre() + " es "
                + persona.calcularEdad() + " años.");
        Write.withLineBreak("Ingrese una edad: ");
        int anios = Read.integer();
        Write.withLineBreak("La edad de " + persona.getNombre() + " "
                + ((persona.menorQue(anios))? "si" : "no") +" es menor que " + anios + " años.");
        Write.withLineBreak(persona.mostrarPersona());*/

        //Ejercicio 13
        Curso curso1 = Curso.crearCurso();
        curso1.calcularGananciaSemanal();
        System.out.println(curso1.toString());
        Curso curso2 = Curso.crearCurso();
        curso2.calcularGananciaSemanal();
        System.out.println(curso2.toString());

        //Ejercicio 14
        Movil movil1 = Movil.cargarCelular();
        System.out.println(movil1.toString());
        Movil movil2 = Movil.cargarCelular();
        System.out.println(movil2.toString());

    }
}