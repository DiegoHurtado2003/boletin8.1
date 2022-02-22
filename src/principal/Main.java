package principal;
import  java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand=new Random();
        //rand.nextInt(7);
        System.out.println(rand.nextInt(9));

        ArrayEjercicio1 array=new ArrayEjercicio1();



        int[] arrayAleatorio=new int[10] ;

        for (int i=0;i<arrayAleatorio.length;i++)
            arrayAleatorio[i] = (int) (Math.random()*200)+100;

        System.out.println("Array aleatorío");
        for (int j : arrayAleatorio) {
            System.out.print(j+" ");
            }
        System.out.println();

        int[] nuevoArray;

         nuevoArray=array.arrayPar(arrayAleatorio);

        System.out.println("Array rellenado con los pares del anterior");
        for (int j : nuevoArray) {
            System.out.print(j+" ");
        }
        System.out.println();

        System.out.println("Array rellenado con números aleatorios sin repetir:");
int[] array2 = new int[10];
array.llenarArrayAleatorio(array2);

        for (int j : array2) {
            System.out.print(j+" ");
        }
        System.out.println();


    }
}
