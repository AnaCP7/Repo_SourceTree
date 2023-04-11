class MiExcepcion1 extends Exception{}
class MiExcepcion2 extends Exception{}
class MiExcepcion3 extends Exception{}

public class Ejercicio7 {
    public static void lanzarExcepciones() throws MiExcepcion1, MiExcepcion2, MiExcepcion3{
        int cod=2;
        switch (cod){
            case 1:
                throw new MiExcepcion1();
            case 2:
                throw new MiExcepcion2();
            case 3:
                throw new MiExcepcion3();
        }
    }
    public static void main(String[] args) {
        try{
            lanzarExcepciones();
        }catch (MiExcepcion1 | MiExcepcion2 | MiExcepcion3 e){
            System.out.println("Se ha producido una excepción" +e);
        }
    }


}
