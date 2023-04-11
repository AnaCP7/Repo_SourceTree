public class Ejercicio6{
    public static void main(String[] args) {
        try{
            f();
        }catch (MiExcepcionB me){
            throw new RuntimeException(me);
        }
    }
    static void f() throws MiExcepcionB{
        try {
            g();
        }catch (OtraExcepcionB oe){
            throw new MiExcepcionB("Excepción desde f()", oe);
        }
    }

    static void g() throws OtraExcepcionB{
        throw new OtraExcepcionB("Excepción desde g()") ;
    }
}

class MiExcepcionB extends Exception{
    public MiExcepcionB(String msn, Throwable cause){
        super(msn, cause);
    }
}

class OtraExcepcionB extends Exception{
    public OtraExcepcionB(String msn){
        super(msn);
    }
}
