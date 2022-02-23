package principal;


import java.util.Arrays;

public class ArrayEjercicio1 {


    public boolean es_par(int numero) {
        return numero % 2 == 0;
    }


    public int[] arrayPar(int[] array) {
        int contadorPares = 0, aux = 0;

        for (int j : array) {
            if (es_par(j)) {
                contadorPares++;
            }
        }

        int[] arrayNuevo = new int[contadorPares];

        for (int k : array) {
            if (es_par(k)) {
                arrayNuevo[aux] = k;
                aux++;

            }
        }

        return arrayNuevo;
    }



    public  void llenarArrayAleatorio( int[] array) {
        int aux=0;
        int numAleatorio;

        for ( int i = 0; i < array.length; i++) {
            do {
                numAleatorio = (int) (Math.random() * 10) + 100;
            } while (comprobarSiEsta(array , i, numAleatorio));
            array[aux] = numAleatorio;
            aux++;
        }
        }



    public static boolean comprobarSiEsta(int[] numeros, int indice, int valor) {
        for (int i = 0; i < indice; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        return false;
    }


    //  public int[] se_repite(int n) {
        //   int[] arrayNuevo = new int[n];
        //   int numAleatorio, aux2 = 0;

        // arrayNuevo[0] = (int) (Math.random() * 200) + 100;
        //  numAleatorio = (int) (Math.random() * 4) + 100;
        //  for (int j : arrayNuevo) {

            //   if (se_repite_recorrer(arrayNuevo,aux2,numAleatorio)) {
            //       arrayNuevo[aux2] = numAleatorio;
            //      numAleatorio = (int) (Math.random() * 4) + 100;
            //    aux2++;
            //  }

            //  }
            //  return arrayNuevo;

            //  }

   // public boolean se_repite_recorrer(int[] array, int index, int numAleatorio) {
     //   boolean resultado = false;
       // for (int i = 0; i < index; i++) {
         //   //realizamos la comparación
           // if (numAleatorio == array[i]) {
                // si el número se repite, establecemos repetido=true
                // y salimos del bucle for (no es necesario seguir comparando)
             //    resultado = true;

            //}
            //else resultado= false;
    //    }
//return resultado;
 //  }



    public boolean esPrimo(int numero) {
        boolean primo=false;

        if ((factorial(numero-1)+1)%numero==0){primo=true;}

        return primo;
    }

    public int factorial(int numero){
       int resultado=1;

       if (numero==1) {
           resultado = 1;
       }else {
           resultado = numero * factorial(numero - 1);
       }
        return resultado;
    }
    //El fallo que tenía es que multiplicaba

    public int[] arrayPrimo(int[] array) {
        int contadorPrimos = 0;
        int[] arrayNuevo = new int[array.length];
        for (int elemento : array) {
            if (esPrimo(elemento)) {
                arrayNuevo[contadorPrimos]=elemento;
                contadorPrimos++;

            }
        }

              int[] arrayFinal=Arrays.copyOfRange(arrayNuevo,0,contadorPrimos-1);

        return arrayFinal;
    }


    public int[]  arrayReves(int[] array){
        int[] arrayFinal=new int[array.length];
        System.arraycopy(array, array.length,arrayFinal,0,array.length);
        return arrayFinal;
    }


}