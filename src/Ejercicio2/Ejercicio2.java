package Ejercicio2;

public class Ejercicio2 {

public int mayorTemperatura(int[]array){

    int mayor=array[0];

    for(int indice=1; indice < array.length; indice++ ){

        if(array[indice]>mayor){
            mayor=array[indice];
        }

    }
return mayor;
}


public int menorTemperature(int[] array){

    int menor=array[0];

    for(int indice=1; indice < array.length; indice++ ){

        if(array[indice]<menor){
            menor=array[indice];
        }

    }
    return menor;
}


public double calcularMedia(int[] array){
    double resultado=0;
    int acumulador=0;

    for (int indice=1; indice < array.length; indice++
    ) {
        acumulador=acumulador+array[indice];
    }

    resultado=(float)acumulador/ array.length;

    return resultado;
}


    /**
     *
     * @param array Tenemos qeu introduir un array
     * @return devuelve el múmero de alumnos superiores a la media
     */
    public int alumnosSuperioresALaMedia(int[] array){

    int acumulador=0;

    for (int indice=1; indice < array.length; indice++
    ) {
        if (array[indice] > calcularMedia(array))

        acumulador=acumulador+array[indice];
    }

    return acumulador;
}


    public int alumnosInferiroresALaMedia(int[] array){

        int acumulador=0;

        for (int indice=1; indice < array.length; indice++
        ) {
            if (array[indice] < calcularMedia(array))

                acumulador=acumulador+array[indice];
        }

        return acumulador;
    }


    public void menu(){
        System.out.println("Introduzca 1 para obtener la nota más alta\n" +
                "Introduzca 2 para obtener la nota más baja\n" +
                "Imprimer la media de todas las notas"+
                "Introduzca 3 para obtener el número de alumnos superiores a la media\n" +
                "Introduzca 4 para obtener el número de alumnos inferiores a la media\\n"
                );
    }

}
