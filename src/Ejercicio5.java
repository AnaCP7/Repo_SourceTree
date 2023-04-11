public class Ejercicio5 {
    static class MiExcepcion extends Exception{
        public MiExcepcion(String msn){
            super(msn);
        }
    }

    static class OtraExcepcion extends Exception{
        public OtraExcepcion(String msn){
            super(msn);
        }
    }

    static void g() throws MiExcepcion{
        throw new MiExcepcion("Excepción en g()");
    }

    static void f() throws OtraExcepcion{
        try{
            g();
        }catch(MiExcepcion e){
            throw new OtraExcepcion("Excepción en f()");
        }
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (OtraExcepcion e){
            System.out.println("Ha ocurrido un error: "+e.getMessage());
        }
    }
}
