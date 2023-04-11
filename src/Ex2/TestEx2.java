package Ex2;

public class TestEx2 {
   public static void main(String[] args) {
        try{
            throw new MiExcepcion("Algo no ha salido bien!!. \n Inténtalo de nuevo");
        }catch (MiExcepcion e){
            e.printMensaje();
        }
    }
    public static void lanzarMiExcepcion() throws MiExcepcion{
        throw new MiExcepcion("Excepción personalizada");
    }
}
