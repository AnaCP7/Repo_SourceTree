public class Ejercicio1 {
    public static void main(String[] args) {
        try{
            throw new Exception("Hay una excepción");
        }catch (Exception e){
            System.out.println("Excepción encontrada: " +e.getMessage());
        }finally {
            System.out.println("Se ha lanzado la excepción con éxito");
        }
    }
}
//prueba de conflictos - ginebra
//vamos a probar incidencias

