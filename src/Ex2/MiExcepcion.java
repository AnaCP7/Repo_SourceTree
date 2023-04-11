package Ex2;

public class MiExcepcion extends Exception{
    private String mensaje;

    public MiExcepcion(String mensaje){
        this.mensaje=mensaje;
    }

       public void printMensaje(){
           System.out.println("Mensaje de excepción: " +mensaje);
       }

    public  String getMensaje(){
        return mensaje;
    }
}
