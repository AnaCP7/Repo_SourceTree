public class Ejercicio4 {
    public static void main(String[] args) {
        String str= "algo";
        Integer num=null;
        try {
            num = Integer.parseInt(str);
            //execepción que ocurre cuando se intenta convertir de String a un tipo int, double, float, etc y la cadena no tiene formato válido para convertirla
        }catch (NumberFormatException e){
            System.out.println("Se ha encontrado una excepción!!" + e);
        }
        System.out.println("Número: " + num);
    }
}
