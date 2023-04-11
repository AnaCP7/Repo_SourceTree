public class Ejercicio9 {
    public static void main(String[] args) {
        boolean programa = false;
        while (!programa) {
            try {

                int result = algo();
                programa=true;
                break;
            } catch (Exception e) {
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }

        System.out.println("Se ha ejecutado con éxito");
        }

        public static int algo() throws Exception{
            int result =(int)(Math.random()*10);
            if(result<5){
                throw new Exception("El resultado es inferior a 5: " + result);
            }
            return result;
    }
}
