import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        do{
            System.out.println("###### Ingrese el Ejercicio que desea Revisar ######");
            System.out.println("1.Hola Mundo\n2.Suma\n3.Par o Impar\n4.Factorial\n5.Tabla de Multiplicaciones\n6.Salir");
            opc = scan.nextInt();
            switch(opc) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    suma(scan);
                    break;
                case 3:
                    parImpar(scan);
                    break;
                case 4:
                    factorial(scan);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
                case 5:
                    multiplicacion(scan);
                    break;
                case 6:
                    System.out.println("Cerrando el Programa");
            }
        }while(opc!=6);
    }
    //Funciones
    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    public static void suma(Scanner scan){
        int n1, n2;
        System.out.println("++++++ Suma ++++++");
        System.out.println("Ingrese un numero");
        n1 = scan.nextInt();
        System.out.println("Ingrese un segundo numero");
        n2 = scan.nextInt();

        System.out.println("El resultado de la Suma de los numeros Ingresados es de: " + (n1+n2));
    }

    public static void parImpar(Scanner scan){
        int n1;
        System.out.println("+-+-+- Par o Impar +-+-+-");
        System.out.println("Ingrese un numero");
        n1 = scan.nextInt();

        if (n1%2==0){
            System.out.println("El numero Ingresado es Par");
        }
        else {
            System.out.println("El numero Ingresado es Impar");
        }
    }

    public static void factorial(Scanner scan){
        int n1, res=1;
        System.out.println("!!!!!! Factorial !!!!!!");
        System.out.println("Ingrese un numero");
        n1 = scan.nextInt();

        for (int i = 1; i <= n1; i++) {
            res = res*i;
        }

        System.out.println("El resultado de la Factorial es de: " +res);
    }

    public static void multiplicacion(Scanner scan){
        int n1, opc;
        System.out.println("****** Multiplicacion ******");
        System.out.println("Ingrese un numero");
        n1 = scan.nextInt();

        System.out.println("¿Que orden desea usar?\n1.Ascendente\n2.Descendente");
        opc = scan.nextInt();

        switch(opc){
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n1 + " * " + i + " = " + (n1*i));
                }
                break;
            case 2:
                for (int i = 10; i >= 1; i--) {
                    System.out.println(n1 + " * " + i + " = " + (n1*i));
                }
        }
    }
}