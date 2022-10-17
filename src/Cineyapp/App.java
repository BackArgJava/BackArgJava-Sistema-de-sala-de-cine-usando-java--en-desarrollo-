package Cineyapp;


import java.util.Scanner;



public class App {

     final static Scanner scanner = new Scanner(System.in);
     static Cine cine;

     private static void comprarBoleto(){
         boolean flag;
         int comprarFila;
         int comprarColumna;
         do{
             System.out.println("\nIngresa un numero de fila");
             comprarFila = scanner.nextInt();
             System.out.println("\nIngresa un numero de columna");
             comprarFila = scanner.nextInt();
             //Flag verifica si el asiento esta disponible
             flag = cine.verificarAsiento(comprarFila, comprarFila);
         }while (!flag);
    }

    public static void main(String[] args) {
                     //Se crea el menu con salto
        String menu = "\n1.Ver asientos\n" +
                      "2. Comprar boletos\n" +
                       "3. Estadisticas\n" +
                        "4.Salir";

        //por sistema le pedeimos que se ingrese las filas
        System.out.println("Se creara una sala de cine por favor  ingresar : ");
        //por sistema le pedeimos que se ingrese las filas
        System.out.println("Ingresar filas :");
        int filas = scanner.nextInt();
        //por sistema le pedeimos que se ingrese las columnas
        System.out.println("Ingresar columnas : ");
        int columnas = scanner.nextInt();
        // gracias a esto podemos acceder a las filas y columnas que se crearon en la clase cine
        cine = new Cine(filas, columnas);
        cine.llenarSalaPorDefecto();


        int opcion;
        do{
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    cine.imprimirSala();
                    break;
                case 2: break;
                case 3: break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion !=4);

    }

}
