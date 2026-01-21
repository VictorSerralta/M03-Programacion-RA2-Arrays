import java.util.Scanner;

public class StringPruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String cadena = "Hola que tal com estas";
        String[] vectorSeparat = cadena.split(" ");
        for (String a : vectorSeparat) System.out.println(a);
    }
}
