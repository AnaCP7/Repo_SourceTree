import java.lang.ArrayIndexOutOfBoundsException;
public class Ejercicio8 extends Exception{
    public static void main(String[] args) {
        try{
            int[] array = {1,2,3,4};
            int elemento=array[4];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha producido un error, el índice de la matriz esta fuera de rango!");
        }
    }
}
