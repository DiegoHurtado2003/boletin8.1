package principal;
import  java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand=new Random();
        //rand.nextInt(7);
        System.out.println(rand.nextInt(9));

        ArrayEjercicio1 array=new ArrayEjercicio1();



        int[] arrayAleatorio=new int[100] ;

        for (int i=0;i<arrayAleatorio.length;i++)
            arrayAleatorio[i] = (int) (Math.random()*200)+100;

        for (int j : arrayAleatorio) {
            System.out.print(j+" ");
            }
        System.out.println();

        int[] nuevoArray;

         nuevoArray=array.arrayPar(arrayAleatorio);

        for (int j : nuevoArray) {
            System.out.print(j+" ");
        }
        System.out.println();

int[] array2= array.se_repite(20);

        for (int j : array2) {
            System.out.print(j+" ");
        }
        System.out.println();
    

    }
}
