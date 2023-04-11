package Ex2;
import Ex2.MiExcepcion;
public class Ejercicio3 {
    public static void main(String[] args) {
        try{
            //Ejercicio3 miObjeto = new Ejercicio3();
            //miObjeto.myMethod();
            TestEx2.lanzarMiExcepcion();
        }catch (MiExcepcion e){
            System.out.println("Excepción encontrada: patata " + e.getMensaje());
        }
    }
    public void myMethod() throws MiExcepcion{
        throw new MiExcepcion("Algo no ha salido bien");
    }
}
