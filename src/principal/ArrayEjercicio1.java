package principal;



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


    public int[] se_repite(int n) {
        int[] arrayNuevo = new int[n];
        int numAleatorio, aux2 = 0;

        // arrayNuevo[0] = (int) (Math.random() * 200) + 100;
        numAleatorio = (int) (Math.random() * 4) + 100;
        for (int j : arrayNuevo) {

            if (se_repite_recorrer(arrayNuevo,aux2,numAleatorio)) {
                arrayNuevo[aux2] = numAleatorio;
                numAleatorio = (int) (Math.random() * 4) + 100;
                aux2++;
            }

        }
        return arrayNuevo;

    }

    public boolean se_repite_recorrer(int[] array, int index, int numAleatorio) {
        boolean resultado = false;
        for (int i = 0; i < index; i++) {
            //realizamos la comparación
            if (numAleatorio == array[i]) {
                // si el número se repite, establecemos repetido=true
                // y salimos del bucle for (no es necesario seguir comparando)
                 resultado = true;

            }
            else resultado= false;
        }
return resultado;
    }
}