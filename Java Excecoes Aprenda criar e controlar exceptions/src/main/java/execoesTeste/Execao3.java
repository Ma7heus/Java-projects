package execoesTeste;

public class Execao3 {

    public static void chamada3(String nome) {
        try {
            System.out.println(nome);
        }catch (NullPointerException ex) {
            throw ex;
        }
    }
}
