package Cineyapp;

public class Cine {
    //definimos los parametros y valores
    private final int columna;
        private final int fila;
    //el array debe tener los 2 indices ya que sera un  array bidimensional
    private String[][] sala;
    private int ticket;
    private int ingresoActual;

    //generamos los contructores
    public Cine(int fila, int columna) {

        this.fila = fila;
        this.columna = columna;
        this.sala = new String[fila + 1 ][columna + 1];
        this.ticket=0;


    }

    public void llenarSalaPorDefecto(){
        //recorremos el array bidimensional con el bucle for
        for(int i=0; i<sala.length; i++){
        for(int j=0 ; j<sala[0].length; j++){
           // esto es porque en la sala se tiene en cuenta la la fila 0 y columna 0
            if(i==0 && j==0)sala[i][j] =" ";

            else if (i==0) sala[i][j] = String.valueOf(j);//Convertimos el numero i en una cadena
            else if (j==0) sala[i][j] = String.valueOf(i);//Convertimos el numero j en una cadena
            else sala[i][j] = "\033[32mD\033[0m"; // se utilizan estos caracteres para colocar los asientos en verde
        }

        }
    }
      public void imprimirSala(){
          System.out.println("\nSala de cine:\n");
          for(String[] asientos : sala){
              for(int j = 0; j < sala[0].length; j++){
                  System.out.print(asientos[j] + " ");
              }
              System.out.println("\n");
          }

      }
        // verificamos  la disponibilidad de los asientgos
         public boolean verificarAsiento(int comprarFila,int comprarColumna){
         return true;
         }
         public void comprarBoleto(int comprarFila,int comprarColumna){
         int precio= 10;
         //se va sumando  por cada compra
         ticket+=1;
         ingresoActual += precio;
              //en el array de sala esta en la posicion comprar fila
         sala[comprarFila][comprarColumna] ="O";
             System.out.println("\nPrecio del boleto: $" + precio);

         }
}